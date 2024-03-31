package starter.user;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.rest.SerenityRest;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.isEmptyOrNullString;

public class DeletePostById {
    private static final String URL = "https://jsonplaceholder.typicode.com/posts/";

    @Step("I set API endpoint to delete post by ID")
    public String setApiEndpoint() {
        return URL + "1";
    }

    @Step("I send a request to delete post by ID")
    public void sendDeletePostByIdRequest() {
        SerenityRest.given()
                .delete(setApiEndpoint());
    }

    @Step("I receive status code 200")
    public void receiveStatusCode200() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I receive valid data for deleted post")
    public void receiveValidDeletedPostData() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.DELETE_POST_SCHEMA);

        restAssuredThat(response -> response.body(isEmptyOrNullString()));
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }
}
