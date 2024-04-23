package starter.object;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class Home extends PageObject {
    private By productsTitle(){
        return By.className("title");
    }

    private By getProductCard(String id){
        return By.id("add-to-cart-"+id);
    }

    private By getCartButton(){
        return By.className("shopping_cart_link");
    }

    private By getProductTitle(String title){
        return By.xpath("//*[text()='" + title+ "']");
    }
    @Step
    public void validateOnTheHomePage(){
        $(productsTitle()).isDisplayed();
    }

    @Step
    public void clickProduct(String id){
        $(getProductCard(id)).click();
    }
    @Step
    public void clickCartButton(){
        $(getCartButton()).click();
    }
    @Step
    public void clickProductTitle(String title){
        $(getProductTitle(title)).click();
    }
}
