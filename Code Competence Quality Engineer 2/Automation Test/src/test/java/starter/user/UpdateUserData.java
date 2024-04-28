package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;
import starter.utils.JsonSchemaHelper;
import starter.utils.JsonSchema;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class UpdateUserData {
    private static String url = "https://fakestoreapi.com/";

    @Step("I set API endpoint for update user data")
    public String setApiUpdateUser() {
        return url + "users/7";
    }

    @Step("I send request to update user with valid credential")
    public void sendUpdateUser() {
        JSONObject requestBody = new JSONObject();

        requestBody.put("email", "John@gmail.com");
        requestBody.put("username","johnd");
        requestBody.put("password","m38rmF$");

        JSONObject name = new JSONObject();
        name.put("firstname","John");
        name.put("lastname","Doe");
        requestBody.put("name", name);

        JSONObject add = new JSONObject();
        add.put("city","kilcoole");
        add.put("street","7835 new road");
        add.put("number",3);
        add.put("zipcode","12926-3874");
        requestBody.put("address", add);

        JSONObject geo = new JSONObject();
        geo.put("lat","-37.3159");
        geo.put("long","81.1496");
        add.put("geolocation", geo);

        requestBody.put("phone","1-570-236-7033");

        SerenityRest.given()
                .header("Content-Type","application/json")
                .body(requestBody.toString())
                .put(setApiUpdateUser());
    }

    @Step("I receive valid data for updated user data")
    public void receiveValidUpdatedUser() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.UPDATE_USER_DATA_SCHEMA);
        restAssuredThat(response -> response.body("email",equalTo("John@gmail.com")));
        restAssuredThat(response -> response.body("username",equalTo("johnd")));
        restAssuredThat(response -> response.body("password",equalTo("m38rmF$")));

        JSONObject name = new JSONObject();
        name.put("firstname","John");
        name.put("lastname","Doe");
        restAssuredThat(response -> response.body("name",equalTo(name)));

        JSONObject add = new JSONObject();
        add.put("city","kilcoole");
        add.put("street","7835 new road");
        add.put("number",3);
        add.put("zipcode","12926-3874");
        restAssuredThat(response -> response.body("address",equalTo(add)));

        JSONObject geo = new JSONObject();
        geo.put("lat","-37.3159");
        geo.put("long","81.1496");
        restAssuredThat(response -> response.body("geolocation",equalTo(geo)));

        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }

}
