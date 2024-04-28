package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetLimitCart {

    private static String url = "https://fakestoreapi.com/";

    @Step("I set API endpoint for get cart with limit 5 carts only")
    public String setApiGet5Carts() {
        return url + "carts?limit=5";
    }

    @Step("I send request to get cart with limit 5 carts only")
    public void sendGet5Carts() {
        SerenityRest.given().get(setApiGet5Carts());
    }
    @Step("I receive valid data with limit 5 carts only")
    public void receiveGet5Carts( ) {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.GET_LIMIT_CART_SCHEMA);
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }
}
