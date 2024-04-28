package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetAllCarts {
    private static String url = "https://fakestoreapi.com/";

    @Step("I set API endpoint for get all carts")
    public String setApiGetAllCarts() {
        return url + "carts";
    }

    @Step("I send request to get all carts")
    public void sendGetAllCarts() {
        SerenityRest.given().get(setApiGetAllCarts());
    }

    @Step("I receive valid data for all carts")
    public void receiveCartsData() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.GET_ALL_CARTS_SCHEMA);
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }



}
