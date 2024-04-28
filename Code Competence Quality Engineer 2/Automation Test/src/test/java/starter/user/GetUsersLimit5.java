package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetUsersLimit5 {

    private static String url = "https://fakestoreapi.com/";

    @Step("I set API endpoint for get user with limit 5 users only")
    public String setApiGet5Users() {
        return url + "users?limit=5";
    }

    @Step("I send request to get user with limit 5 users only")
    public void sendGet5Users() {
        SerenityRest.given().get(setApiGet5Users());
    }

    @Step("I receive valid data with limit 5 users only")
    public void receiveGet5Users() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.GET_USERS_5_RESULT_SCHEMA);
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }




}
