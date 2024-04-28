package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class LoginInvalidUsername {
    private static String url = "https://fakestoreapi.com/";

    @Step("I set API endpoint for login with invalid credentials")
    public String setApiInvalid() {
        return url + "auth/login";
    }
    @Step("I send request to login with invalid username {String} and valid password {String}")
    public void sendLoginInvalidUsername(String username, String password) {
        JSONObject requestBody = new JSONObject();

        requestBody.put("username", username);
        requestBody.put("password", password);

        SerenityRest.given()
                .header("Content-Type","application/json")
                .body(requestBody.toString())
                .post(setApiInvalid());
    }
    @Step("I receive status code {int}")
    public void receive404(int code){
        restAssuredThat(response -> response.statusCode((code)));
    }

}
