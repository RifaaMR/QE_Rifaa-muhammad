package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetUsersCart {
    private static String url = "https://fakestoreapi.com/";

    @Step("I set API endpoint for get user cart with id")
    public String setApiGetUsersCarts() {
        return url + "carts/user/2";
    }
    
    @Step("I send request to get user cart with id")
    public void sendGetUsersCart() {
        SerenityRest.given().get(setApiGetUsersCarts());
    }
    
    @Step("I receive valid user cart data")
    public void receiveGetUsersCart( ) {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.GET_USERS_CART_RESULT_SCHEMA);
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }
}
