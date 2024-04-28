package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetLimitProduct {

    private static String url = "https://fakestoreapi.com/";

    @Step("I set API endpoint for get user with limit 5 products only")
    public String setApiGet5Products() {
        return url + "products?limit=5";
    }

    @Step("I send request to get user with limit 5 products only")
    public void sendGet5Products() {
        SerenityRest.given().get(setApiGet5Products());
    }

    @Step("I receive valid data with limit {int} products only")
    public void receiveGet5Products(int numberUser) {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.GET_PRODUCTS_5_RESULT_SCHEMA);
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }
}
