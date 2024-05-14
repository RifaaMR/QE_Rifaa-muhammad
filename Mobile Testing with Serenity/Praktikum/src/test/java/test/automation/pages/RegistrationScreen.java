package test.automation.pages;

import io.appium.java_client.MobileBy;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import test.automation.pageobject.BasePageObject;

public class RegistrationScreen extends BasePageObject {
    private By registerLink() {
        return MobileBy.id("textViewLinkRegister");
    }
    private By emailField() {
        return MobileBy.id("textInputEditTextEmail");
    }
    private By passwordField() {
        return MobileBy.id("textInputEditTextPassword");
    }
    private By nameForm() {
        return MobileBy.id("textInputEditTextName");
    }
    private By passWordConfirm() {
        return MobileBy.id("textInputEditTextConfirmPassword");
    }
    private By registerButton() {
        return MobileBy.id("appCompatButtonRegister");
    }
    private By snackBarText() {
        return MobileBy.id("snackbar_text");
    }
    private By emailErrorMessage() {
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ScrollView/android.support.v7.widget.LinearLayoutCompat/TextInputLayout[2]/android.widget.LinearLayout/android.widget.TextView");
    }
    private By passwordErrorMessage() {
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ScrollView/android.support.v7.widget.LinearLayoutCompat/TextInputLayout[4]/android.widget.LinearLayout/android.widget.TextView");
    }
    @Step
    public void inputName(String name) {
        onType(nameForm(), name);
    }
    @Step
    public void inputEmail(String email) {
        onType(emailField(), email);
    }
    @Step
    public void inputPassword(String password) {
        onType(passwordField(), password);
    }
    @Step
    public void inputPasswordConfirmation(String password) {
        onType(passWordConfirm(), password);
    }
    @Step
    public void tapRegisterButton() {
        onClick(registerButton());
    }
    @Step
    public String waitSnackbarText() {
        return waitUntilVisible(snackBarText()).getText();
    }
    public String waitEmailError() {
        return waitUntilVisible(emailErrorMessage()).getText();
    }
    public String waitPasswordError() {
        return waitUntilVisible(passwordErrorMessage()).getText();
    }
    @Step
    public void tapRegisterLink() {
        onClick(registerLink());
    }
}
