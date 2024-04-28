package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetOneCategory {
    private static String url = "https://fakestoreapi.com/";
    @Step("I set API endpoint for show a product category")
    public String setApiGetOneCategory() {
        return url + "products/category/jewelery";
    }

    @Step("I send request to get a products category")
    public void sendGetOneCategory(){
        SerenityRest.given().get(setApiGetOneCategory());
    }
    @Step("I receive a product category")
    public void receiveOneCategory(){
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.GET_ONE_CATEGORY_SCHEMA);
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }

}
