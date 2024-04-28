package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetSingleCart {

    private static String url = "https://fakestoreapi.com/";

    @Step("I set API endpoint for get Cart data")
    public String setApiGetSingleCart() {
        return url + "carts/5";
    }

    @Step("I send request to get Cart data")
    public void sendGetSingleCart(){
        SerenityRest.given().get(setApiGetSingleCart());
    }

    @Step("I receive valid data from a Cart")
    public void receiveValidSingleCart(){
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.GET_SINGLE_CART_SCHEMA);
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }
}

