package starter.login;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class Payment extends PageObject {
    private By paymentBackButton(){
        return By.className("MuiButtonBase-root");
    }
    @Step
    public void checkBackButtonExist(){
        $(paymentBackButton()).waitUntilVisible();
    }
}
