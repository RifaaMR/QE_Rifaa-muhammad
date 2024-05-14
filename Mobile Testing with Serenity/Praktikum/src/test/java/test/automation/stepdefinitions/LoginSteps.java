package test.automation.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import jdk.jpackage.internal.Log;
import net.thucydides.core.annotations.Steps;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Assert;
import test.automation.pages.LoginScreen;
import test.automation.pages.RegistrationScreen;


public class LoginSteps {
    @Steps
    LoginScreen loginScreen;
    @Steps
    RegistrationScreen registrationScreen;
    private String email;
    @Given("android user on landing screen")
    public void androidUserOnLandingScreen() {
        boolean actual = loginScreen.isOnPage();
        Assert.assertTrue(actual);
    }

    @When("android user input unregistered email: {string}")
    public void androidUserInputUnregisteredEmail(String emailInput) {
        loginScreen.inputEmail(emailInput);
    }

    @And("android user tap login button")
    public void androidUserTapLoginButton() {
        loginScreen.tapLoginButton();
    }

    @And("android user input password: {string}")
    public void androidUserInputPassword(String password) {
        loginScreen.inputPassword(password);
    }

    @Then("android user see {string} message")
    public void androidUserSeeMessage(String message) {
        String actual = loginScreen.getToastMessage();
        Assert.assertEquals(actual, message);
    }

    @Given("android user has successfully register")
    public void androidUserHasSuccessfullyRegister() {
        registrationScreen.tapRegisterLink();
        registrationScreen.inputName("test");
        boolean useNumbers=true;
        boolean useLetter=true;
        String randomString= RandomStringUtils.random(14,useLetter,useNumbers);
        email = randomString+"@gmail.com";
        registrationScreen.inputEmail(email);
        registrationScreen.inputPassword("test@1234");
        registrationScreen.inputPasswordConfirmation("test@1234");
        registrationScreen.tapRegisterButton();
    }

    @When("android user input registered email")
    public void androidUserInputRegisteredEmail() {
        loginScreen.inputEmail(email);
    }

    @Then("android user see email message displayed on home screen")
    public void androidUserSeeMessageDisplayedOnHomeScreen() {
        String actual= loginScreen.getEmailGreeting();
        Assert.assertEquals(this.email,actual);
    }
}
