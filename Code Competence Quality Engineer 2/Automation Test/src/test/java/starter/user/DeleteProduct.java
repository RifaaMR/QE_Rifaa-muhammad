package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class DeleteProduct {
    private String url = "https://fakestoreapi.com/";

    @Step("I set API endpoint for delete product")
    public String setApiDeleteProduct() {
        return url + "products/6";
    }

    @Step("I send request to delete product")
    public void sendDeleteProductRequest() {
        SerenityRest.given().delete(setApiDeleteProduct());
    }
}
