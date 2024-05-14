package test.automation.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Assert;
import test.automation.pages.LoginScreen;
import test.automation.pages.RegistrationScreen;

public class RegistrationSteps {
    @Steps
    RegistrationScreen registrationScreen;

    @And("android user fill valid random name")
    public void androidUserFillValidName() {
        boolean useNumbers=false;
        boolean useLetter=true;
        String randomString= RandomStringUtils.random(14,useLetter,useNumbers);
        registrationScreen.inputName(randomString);
    }

    @And("android user fill valid non-registered email")
    public String androidUserFillValidNonRegisteredEmail() {
        boolean useNumbers=true;
        boolean useLetter=true;
        String randomString= RandomStringUtils.random(14,useLetter,useNumbers);
        String email = randomString+"@gmail.com";
        registrationScreen.inputEmail(email);
        return email;
    }

    @And("android user fill valid password as: {string}")
    public void androidUserFillValidPassword(String password) {
        registrationScreen.inputPassword(password);
    }

    @And("android user fill valid password confirmation {string}")
    public void androidUserFillValidPasswordConfirmation(String password) {
        registrationScreen.inputPasswordConfirmation(password);
    }

    @And("android user press register")
    public void androidUserPressRegister() {
        registrationScreen.tapRegisterButton();
    }

    @Then("android user see {string} message on registration page")
    public void androidUserSeeMessageOnRegistrationPage(String expected) {
        String actual=registrationScreen.waitSnackbarText();
        Assert.assertEquals(actual,expected);
    }
    @When("android user select register hyperlink")
    public void androidUserSelectRegisterHyperlink() {
        registrationScreen.tapRegisterLink();
    }

    @And("android user fill invalid email: {string}")
    public void androidUserFillInvalidEmail(String email) {
        registrationScreen.inputEmail(email);
    }

    @Then("android user see {string} message below email form")
    public void androidUserSeeMessageBelowEmailForm(String message) {
        String actual=registrationScreen.waitEmailError();
        Assert.assertEquals(actual,message);
    }

    @And("android user fill non-matching password confirmation {string}")
    public void androidUserFillnonmatchingPasswordConfirmation(String wrongPassword) {
        registrationScreen.inputPasswordConfirmation(wrongPassword);
    }

    @Then("android user see {string} message below password form")
    public void androidUserSeeMessageBelowPasswordForm(String message) {
        String actual=registrationScreen.waitPasswordError();
        Assert.assertEquals(actual,message);
    }
}
