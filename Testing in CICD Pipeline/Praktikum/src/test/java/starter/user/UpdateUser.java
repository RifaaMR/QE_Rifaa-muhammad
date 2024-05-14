package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;
import starter.utils.JsonSchemaHelper;
import starter.utils.JsonSchema;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class UpdateUser {
    private static String url = "https://reqres.in/api/";

    @Step("I set API endpoint for update user")
    public String setApiEndpoint() {
        return url + "users/2";
    }

    @Step("I send request to update user with valid inputs")
    public void sendUpdateUserRequest() {
        JSONObject requestBody = new JSONObject();

        requestBody.put("name", "morpheus");
        requestBody.put("job","zion resident");

        SerenityRest.given()
                .header("Content-Type","application/json")
                .body(requestBody.toString())
                .put(setApiEndpoint());
    }

    @Step("I receive valid data for updated user")
    public void receiveValidUpdatedUserData() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.UPDATE_USER_RESPONSE_SCHEMA);

        restAssuredThat(response -> response.body("'name'", equalTo("morpheus")));
        restAssuredThat(response -> response.body("'job'", equalTo("zion resident")));
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }

}
