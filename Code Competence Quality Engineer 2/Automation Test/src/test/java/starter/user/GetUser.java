package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;

public class GetUser {
    private static String url = "https://fakestoreapi.com/";

    @Step("I set API endpoint for get single user")
    public String setApiEndpoint() {
        return url + "users/1";
    }

    @Step("I send request to get single user")
    public void sendGetUserRequest() {
        SerenityRest.given().get(setApiEndpoint());
    }

    @Step("I receive valid data for single user")
    public void receiveValidUserData() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.GET_USER_RESPONSE_SCHEMA);
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }

}
