package starter.login;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class Home extends PageObject {
    private By checkHomeButton(){
        return By.className("MuiBottomNavigationAction-wrapper");
    }
    private By pressProductIcon(String product){
        return By.xpath("//*[text()='" + product+ "']");
    }
    @Step
    public void checkHomeButtonExist(){
        $(checkHomeButton()).waitUntilVisible();
    }
    @Step
    public void pressProduct(String product){
        $(pressProductIcon(product)).click();
    }
}
