package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class UpdateCartProduct {

    private static String url = "https://fakestoreapi.com/";

    @Step("I set API endpoint for update product in cart")
    public String setApiUpdateProductCart() {
        return url + "carts/7";
    }

    @Step("I send request to update product in cart with valid credential")
    public void sendUpdateProductCart() {
        JSONObject requestBody = new JSONObject();

        requestBody.put("userId",equalTo(1));
        requestBody.put("date",is("2019-12-10"));

        JSONObject product1 = new JSONObject();
        product1.put("productId:",equalTo(1));
        product1.put("quantity:",equalTo(1));
        requestBody.put("products",is(product1));



        SerenityRest.given()
                .header("Content-Type","application/json")
                .body(requestBody.toString())
                .put(setApiUpdateProductCart());

    }

    @Step("I receive valid data for updated product in cart")
    public void receiveValidUpdatedCart() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.UPDATE_NEW_PRODUCTS_CART);
        JSONObject product1 = new JSONObject();
        product1.put("productId",1);
        product1.put("quantity",3);
        restAssuredThat(response -> response.body("products",is(product1)));
        restAssuredThat(response -> response.body("id",is(7)));
        restAssuredThat(response -> response.body("userId",is(3)));
        restAssuredThat(response -> response.body("date",is("2019-12-10")));
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }
}
