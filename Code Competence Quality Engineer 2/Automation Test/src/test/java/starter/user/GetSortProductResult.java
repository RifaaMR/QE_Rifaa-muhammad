package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetSortProductResult {
    private static String url = "https://fakestoreapi.com/";

    @Step("I set API endpoint for get product with sort result")
    public String setApiGetSortProduct() {
        return url + "products?sort=desc";
    }

    @Step("I send request to get user with sort result")
    public void sendGetSortProduct() {
        SerenityRest.given().get(setApiGetSortProduct());
    }

    @Step("I receive valid data with sort result")
    public void receiveSortProduct() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.GET_SORT_PRODUCT_RESULT_SCHEMA);
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));

    }
}
