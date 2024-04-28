package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class DeleteProductInCart {

    private String url = "https://fakestoreapi.com/";

    @Step("I set API endpoint for delete product in cart")
    public String setApiDeleteProductInCart() {
        return url + "carts/6";
    }

    @Step("I send request to delete product in cart")
    public void sendDeleteProductInCart() {
        SerenityRest.given().delete(setApiDeleteProductInCart());
    }
}
