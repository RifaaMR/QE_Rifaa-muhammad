package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;
public class LoginInvalidPassword {

    LoginInvalidUsername loginInvalidUsername;

    @Step("I send request to login with valid username {String} and invalid password {String}")
    public void sendLoginInvalidPassword(String username, String password) {
        JSONObject requestBody = new JSONObject();

        requestBody.put("username", username);
        requestBody.put("password", password);

        SerenityRest.given()
                .header("Content-Type","application/json")
                .body(requestBody.toString())
                .post(loginInvalidUsername.setApiInvalid());
    }
}
