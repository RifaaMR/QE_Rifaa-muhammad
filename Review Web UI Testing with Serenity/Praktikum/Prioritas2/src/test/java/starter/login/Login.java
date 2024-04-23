package starter.login;

import net.serenitybdd.screenplay.actions.OpenUrl;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import net.thucydides.core.pages.PageObject;

public class Login extends PageObject{
    private By signInButton(){
        return By.className("signup-button");
    }

    private By emailForm(){
        return By.id("email");
    }

    private By passwordForm(){
        return By.id("password");
    }
    private By alert(){
        return By.id("alert_description");
    }


    public void checkSignInButton(){
        $(signInButton()).isDisplayed();
    }
    public void inputEmail(String email){
        $(emailForm()).type(email);
    }
    public void inputPassword(String password){
        $(passwordForm()).type(password);
    }
    public void pressSignIn(){
        $(signInButton()).click();
    }
    public void checkErrorAppear(){
        $(alert()).waitUntilVisible();
    }
}
