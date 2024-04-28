package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetUserWithSortResult {
    private static String url = "https://fakestoreapi.com/";

    @Step("I set API endpoint for get all users")
    public String setApiGetSortResult(){
        return url + "users?sort=desc";
    }

    @Step("I send request to get user with sort result")
    public void sendGetSortResult() {
        SerenityRest.given().get(setApiGetSortResult());
    }

    @Step("I receive valid data with sort result")
    public void receiveSortResult(){
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.SORT_USER_SCHEMA);
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }

}
