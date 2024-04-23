package starter.object;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class Product extends PageObject {
    private By backButtonExist(){
        return By.id("back-to-products");
    }

    private By getProductTitle(){
        return By.id(".inventory_details_name");
    }

    private By getProductDesc(){
        return By.id(".inventory_details_desc");
    }
    private By getProductPrice(){
        return By.id(".inventory_details_price");
    }

    private By getProductImage(){
        return By.id(".inventory_details_img");
    }
    private By getAddToCart(){
        return By.xpath("//*[text()='Add to cart']");
    }

    @Step
    public void checkBackButton(){
        $(backButtonExist()).isVisible();
    }
    @Step
    public void checkProductTitle(String title){
        $(getProductTitle()).equals(title);
    }
    @Step
    public void checkProductDesc(){
        $(getProductDesc()).isVisible();
    }

    @Step
    public void checkProductPrice(){
        $(getProductPrice()).isVisible();
    }
    @Step
    public void checkProductImage(){
        $(getProductImage()).isVisible();
    }
    @Step
    public void pressAddToCart(){
        $(getAddToCart()).click();
    }
}
