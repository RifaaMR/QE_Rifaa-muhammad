package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetAllCategories {
    private static String url = "https://fakestoreapi.com/";

    @Step("I set API endpoint for show all product categories")
    public String setApiGetAllCategories() {
        return url + "products/categories";
    }

    @Step("I send request to get all products categories")
    public void sendGetAllCategories(){
        SerenityRest.given().get(setApiGetAllCategories());
    }

    @Step("I receive all product categories")
    public void receiveValidProduct(){
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.GET_ALL_PRODUCTS_CATEGORIES_SCHEMA);
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }
}
