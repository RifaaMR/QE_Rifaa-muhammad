package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;
import starter.utils.JsonSchemaHelper;
import starter.utils.JsonSchema;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.notNullValue;

public class LoginValidUsername {
    private static String url = "https://fakestoreapi.com/";

    @Step("I set API endpoint for login")
    public String setApiEndpoint() {
        return url + "auth/login";
    }

    @Step("I send request to login with valid username {string} and valid password {string}")
    public void sendLoginRequest(String username, String password) {
        JSONObject requestBody = new JSONObject();

        requestBody.put("username", username);
        requestBody.put("password", password);

        SerenityRest.given()
                .header("Content-Type","application/json")
                .body(requestBody.toString())
                .post(setApiEndpoint());
    }
//    @Step("I receive status code 200")
//    public void receiveStatusCode200() {
//        restAssuredThat(response -> response.statusCode(200));
//    }

    @Step("I receive valid data for login")
    public void receiveValidDataForLogin() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.LOGIN_RESPONSE_SCHEMA);

        restAssuredThat(response -> response.body("'token'", notNullValue()));
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }

}
