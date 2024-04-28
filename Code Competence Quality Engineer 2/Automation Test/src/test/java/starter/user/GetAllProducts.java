package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetAllProducts {

    private static String url = "https://fakestoreapi.com/";
    @Step("I set API endpoint for get all products")
    public String setApiGetAllProduct() {
        return url + "products";
    }

    @Step("I send request to get all products")
    public void sendGetAllProduct(){
        SerenityRest.given().get(setApiGetAllProduct());
    }

    @Step("I receive valid data for all products")
    public void receiveValidProduct(){
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.GET_ALL_PRODUCTS_SCHEMA);
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }
}
