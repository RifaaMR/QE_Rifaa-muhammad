package starter.user;

import com.github.fge.jsonschema.main.JsonSchema;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.rest.SerenityRest;
import org.json.JSONObject;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class UpdatePostById {
    private static final String URL = "https://jsonplaceholder.typicode.com/posts/";

    @Step("I set API endpoint to update post by ID")
    public String setApiEndpoint() {
        return URL + "1";
    }

    @Step("I send a request to update post by ID")
    public void sendUpdatePostByIdRequest() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("title", "Updated Title");
        requestBody.put("body", "Updated Body");

        SerenityRest.given()
                .contentType("application/json")
                .body(requestBody.toString())
                .put(setApiEndpoint());
    }

    @Step("I receive status code 200")
    public void receiveStatusCode200() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I receive valid data for updated post")
    public void receiveValidUpdatedPostData() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.UPDATE_POST_SCHEMA);

        restAssuredThat(response -> response.body("'title'", equalTo("Updated Title")));
        restAssuredThat(response -> response.body("'body'", equalTo("Updated Body")));

        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }
}
