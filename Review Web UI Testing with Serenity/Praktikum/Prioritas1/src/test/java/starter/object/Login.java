package starter.object;

import net.serenitybdd.screenplay.actions.OpenUrl;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import net.thucydides.core.pages.PageObject;

public class Login extends PageObject{
    private By usernameField(){
        return By.id("user-name");
    }

    private By passwordField(){
        return By.id("password");
    }

    private By loginButton(){
        return By.id("login-button");
    }

    private By loginErrorMessage(){
        return By.className("error-message-container");
    }
    @Step
    public static OpenUrl url(String targetUrl){
        return new OpenUrl(targetUrl);
    }

    @Step
    public void validateOnTheLoginPage(){
        $(loginButton()).isDisplayed();
    }

    @Step
    public void inputUsername(String username){
        $(usernameField()).type(username);
    }

    @Step
    public void inputPassword(String password){
        $(passwordField()).type(password);
    }

    @Step
    public void clickButtonLogin(){
        $(loginButton()).click();
    }

    @Step
    public void checkErrorMessage(){
        $(loginErrorMessage()).isDisplayed();
    }
}
