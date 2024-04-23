package starter.object;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class Cart extends PageObject {
    private By productsTitle(){
        return By.className("inventory_item_name");
    }

    private By removeButton(String name){
        return By.id("remove-"+name);
    }

    private By checkoutButton(){
        return By.id("checkout");
    }
    @Step
    public void checkTitle(String title){
        $(productsTitle()).equals(title);
    }
    @Step
    public void pressRemove(String id){
        $(removeButton(id)).click();
    }

    @Step
    public void checkNotExist(){
        $(productsTitle()).shouldNotBeVisible();
    }
    @Step
    public void pressCheckout(){
        $(checkoutButton()).click();
    }
}
