package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetSortCartResult {

    private static String url = "https://fakestoreapi.com/";

    @Step("I set API endpoint for get cart with sort result")
    public String setApiGetSortCart() {
        return url + "carts?sort=desc";
    }

    @Step("I send request to get cart with sort result")
    public void sendGetSortCart() {
        SerenityRest.given().get(setApiGetSortCart());
    }

    @Step("I receive valid cart data with sort result")
    public void receiveSortProduct() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.GET_SORT_CART_RESULT_SCHEMA);
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));

    }


}
