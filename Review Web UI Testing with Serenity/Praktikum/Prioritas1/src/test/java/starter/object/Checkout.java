package starter.object;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class Checkout extends PageObject {
    private By firstNameForm(){
        return By.id("first-name");
    }
    private By lastNameForm(){
        return By.id("last-name");
    }
    private By zipCodeForm(){
        return By.id("postal-code");
    }
    private By continueButton(){
        return By.id("continue");
    }
    private By findTitle(){
        return By.className("inventory_item_name");
    }
    private By finishButton(){
        return By.id("finish");
    }
    private By orderSuccess(){
        return By.className("complete-header");
    }
    @Step
    public void fillDetailForm(String firstName,String lastName,String zipCode){
        $(firstNameForm()).type(firstName);
        $(lastNameForm()).type(lastName);
        $(zipCodeForm()).type(zipCode);
    }
    @Step
    public void clickContinueButton(){
        $(continueButton()).click();
    }
    @Step
    public void checkTitle(String title){
        $(findTitle()).equals(title);
    }
    @Step
    public void pressFinish(){
        $(finishButton()).click();
    }

    @Step
    public void checkSuccess(){
        $(orderSuccess()).isVisible();
    }
}
