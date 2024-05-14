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
    private static String url = "https://reqres.in/api/";

    @Step("I set API endpoint for get user")
    public String setApiEndpoint() {
        return url + "users/2";
    }

    @Step("I send request to get user")
    public void sendGetUserRequest() {
        SerenityRest.given().get(setApiEndpoint());
    }

    @Step("I receive status code 200")
    public void receiveStatusCode200() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I receive valid data for user")
    public void receiveValidUserData() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.GET_USER_RESPONSE_SCHEMA);

        restAssuredThat(response -> response.body("'data'.'id'", equalTo(2)));
        restAssuredThat(response -> response.body("'data'.'email'", notNullValue()));
        restAssuredThat(response -> response.body("'data'.'first_name'", notNullValue()));
        restAssuredThat(response -> response.body("'data'.'last_name'", notNullValue()));
        restAssuredThat(response -> response.body("'data'.'avatar'", notNullValue()));

        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }

}
