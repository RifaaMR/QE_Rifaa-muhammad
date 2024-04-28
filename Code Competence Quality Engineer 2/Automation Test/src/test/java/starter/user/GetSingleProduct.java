package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetSingleProduct{

    private static String url = "https://fakestoreapi.com/";
    @Step("I set API endpoint for get product data")
    public String setApiGetSingleProduct() {
        return url + "products/2";
    }

    @Step("I send request to get product data")
    public void sendGetSingleProduct(){
        SerenityRest.given().get(setApiGetSingleProduct());
    }

    @Step("I receive valid data from a product")
    public void receiveValidSingleProduct(){
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.GET_SINGLE_PRODUCTS_SCHEMA);
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }
}
