package starter.login;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class Product extends PageObject {
    private By checkTitle(){
        return By.className("title-main");
    }
    private By pulsaForm(){
        return By.id("phone_number");
    }
    private By nominalPulsa(){
        return By.className("nominal-item");
    }
    @Step
    public void checkTitleWording(String title){
        $(checkTitle()).containsElements(title);
    }
    @Step
    public void enterPulsa(String phone){
        $(pulsaForm()).type(phone);
    }
    @Step
    public void selectNominal(){
        $(nominalPulsa()).click();
    }
}
