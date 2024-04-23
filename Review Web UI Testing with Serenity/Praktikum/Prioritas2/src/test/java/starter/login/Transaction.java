package starter.login;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class Transaction extends PageObject {
    private By checkoutDetail(){
        return By.className("checkout_detail");
    }
    private By emailForm(){
        return By.id("guest_email");
    }
    private By checkboxPayment(){
        return By.className("MuiListItem-gutters");
    }
    private By submitButton(){
        return By.id("submit_payment");
    }
    @Step
    public void checkCheckoutDetail(){
        $(checkoutDetail()).isVisible();
    }
    @Step
    public void typeEmailForm(String email){
        $(emailForm()).type(email);
    }
    @Step
    public void pressCheckbox(){
        $(checkboxPayment()).click();
    }
    @Step
    public void pressPayButton(){
        $(submitButton()).waitUntilVisible().click();
    }
}
