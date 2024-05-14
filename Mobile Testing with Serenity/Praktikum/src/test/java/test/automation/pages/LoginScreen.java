package test.automation.pages;

import io.appium.java_client.MobileBy;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import test.automation.pageobject.BasePageObject;

public class LoginScreen extends BasePageObject {

    private By loginButton() {
        return MobileBy.id("appCompatButtonLogin");
    }

    private By emailField() {
        return MobileBy.id("textInputEditTextEmail");
    }

    private By passwordField() {
        return MobileBy.id("textInputEditTextPassword");
    }
    private By toastMessage() {
        return MobileBy.id("snackbar_text");
    }
    private By emailGreeting() {
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.support.v7.widget.LinearLayoutCompat/android.widget.TextView[3]");
    }

    @Step
    public boolean isOnPage() {
        return waitUntilPresence(loginButton()).isDisplayed();
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
    public void tapLoginButton() {
        onClick(loginButton());
    }

    @Step
    public String getToastMessage() {
        return waitUntilVisible(toastMessage()).getText();
    }
    @Step
    public String getEmailGreeting() {
        return waitUntilVisible(emailGreeting()).getText();
    }
}
