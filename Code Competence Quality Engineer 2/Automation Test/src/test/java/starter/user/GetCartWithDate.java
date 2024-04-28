package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetCartWithDate {

    private static String url = "https://fakestoreapi.com/";

    @Step("I set API endpoint for get all cart in date range")
    public String setApiGetCartWithDate(){
        return url + "carts?startdate=2019-12-10&enddate=2020-10-10";
    }

    @Step("I send request to get all cart in date range")
    public void sendGetCartWithDate() {
        SerenityRest.given().get(setApiGetCartWithDate());
    }

    @Step("I receive valid data for all cart in date range")
    public void receiveCartWithDate(){
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.GET_CART_WITH_DATE_RESULT_SCHEMA);
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }
}
