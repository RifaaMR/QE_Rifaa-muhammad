package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;
import starter.utils.GenerateToken;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class AddNewUser {

    public String url = "https://fakestoreapi.com/";

    @Step("I set API endpoint for add new user")
    public String setApiAddNewUser(){
        return url + "users";
    }

    @Step("I send request to add new user with valid credential \\({String}, {String}, {String}, {String}, {String}, {String}, {String}, {int}, {String}, {String}, {String}, {String})")
    public void sendRequestAddNewUser(String email, String username, String password, String firstname, String lastname,
                                      String city, String street, int number, String zipcode, String lat, String longitude,
                                      String phone){
        JSONObject requestBody = new JSONObject();

        JSONObject name = new JSONObject();
        requestBody.put("firstname", firstname);
        requestBody.put("lastname", lastname);

        JSONObject geolocation = new JSONObject();
        requestBody.put("lat", lat);
        requestBody.put("longitude", longitude);

        JSONObject address = new JSONObject();
        requestBody.put("city", city);
        requestBody.put("street", street);
        requestBody.put("number", number);
        requestBody.put("zipcode", zipcode);
        requestBody.put("geolocation", geolocation);

        requestBody.put("email", email);
        requestBody.put("username", username);
        requestBody.put("password", password);

        requestBody.put("name", name);
        requestBody.put("address", address);

        requestBody.put("phone", phone);

        String token = GenerateToken.generateToken();

                SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token)
                .body(requestBody.toString())
                .post(setApiAddNewUser());
    }

    @Step("I receive valid data for created new user")
    public void receiveNewUser(int id, String email, String username, String password, String firstname, String lastname,
                               String city, String street, String number, String zipcode, String lat, String longitude,
                               String phone){
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.ADD_NEW_USER_SCHEMA);
        restAssuredThat(response -> response.body(equalTo(id)));
        JSONObject name = new JSONObject();
        restAssuredThat(response -> response.body(equalTo(firstname)));
        restAssuredThat(response -> response.body(equalTo(lastname)));

        JSONObject geolocation = new JSONObject();
        restAssuredThat(response -> response.body(equalTo(lat)));
        restAssuredThat(response -> response.body(equalTo(longitude)));

        JSONObject address = new JSONObject();
        restAssuredThat(response -> response.body(equalTo(city)));
        restAssuredThat(response -> response.body(equalTo(street)));
        restAssuredThat(response -> response.body(equalTo(number)));
        restAssuredThat(response -> response.body(equalTo(zipcode)));
        restAssuredThat(response -> response.body(equalTo(geolocation)));

        restAssuredThat(response -> response.body(equalTo(email)));
        restAssuredThat(response -> response.body(equalTo(username)));
        restAssuredThat(response -> response.body(equalTo(password)));

        restAssuredThat(response -> response.body(equalTo(name)));
        restAssuredThat(response -> response.body(equalTo(address)));
        restAssuredThat(response -> response.body(equalTo(phone)));
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));

    }
}
