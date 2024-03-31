package starter.user;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.rest.SerenityRest;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;

public class GetAllUser {
    private static String url = "https://jsonplaceholder.typicode.com/";

    @Step("I set API endpoint for get all user")
    public String setApiEndpoint() {
        return url + "posts";
    }

    @Step("I send a request to get all user")
    public void sendGetAllUserRequest() {
        SerenityRest.given()
                .get(setApiEndpoint());
    }

    @Step("I receive status code 200")
    public void receiveStatusCode200() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I receive valid data for all user")
    public void receiveValidAllUserData() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.GET_ALL_USER_SCHEMA);

        restAssuredThat(response -> response.body("'userId'", notNullValue()));
        restAssuredThat(response -> response.body("'id'", notNullValue()));
        restAssuredThat(response -> response.body("'title'", notNullValue()));
        restAssuredThat(response -> response.body("'body'", notNullValue()));

        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }

    @Step("I am not authorized to access the API endpoint for retrieving users")
    public void unauthorizedAccessToAPIEndpoint() {
        SerenityRest.given().auth().none().get(setApiEndpoint());
    }

    @Step("the response should contain an error message indicating unauthorized access")
    public void verifyUnauthorizedAccessErrorMessage() {
        restAssuredThat(response -> response.statusCode(401));
        restAssuredThat(response -> response.body("error", notNullValue()));
        restAssuredThat(response -> response.body("error", equalTo("Unauthorized")));
    }
}
