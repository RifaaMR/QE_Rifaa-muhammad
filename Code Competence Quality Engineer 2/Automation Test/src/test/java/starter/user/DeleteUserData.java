package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class DeleteUserData {
    private static String url = "https://fakestoreapi.com/";

    @Step("I set API endpoint for delete user data")
    public String setApiDeleteUser() {
        return url + "users/6";
    }

    @Step("I send request to delete user data with valid ID")
    public void sendDeleteUserDataRequest() {
        SerenityRest.given().delete(setApiDeleteUser());
    }
}
