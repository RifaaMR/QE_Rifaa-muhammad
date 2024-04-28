package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.json.JSONObject;
import starter.user.AddNewUser;

public class AddNewUserSteps {

    @Steps
    AddNewUser addNewUser;

    @Given("I set API endpoint for add new user")
    public void setApiAddNewUser(){
        addNewUser.setApiAddNewUser();
    }


    @When("I send request to add new user with valid credential \\({string}, {string}, {string}, {string}, {string}, {string}, {string}, {int}, {string}, {string}, {string}, {string})")
    public void sendRequestAddNewUser(String email, String username, String password, String firstname, String lastname, String city,
                                      String street, int number, String zipcode, String lat, String longitude, String phone) {
        addNewUser.sendRequestAddNewUser(email, username, password, firstname, lastname, city, street, number, zipcode, lat, longitude, phone);
    }


    @And("I receive valid data for created new user")
    public void receiveNewUser(int id, String email, String username, String password, String firstname, String lastname,
                               String city, String street, String number, String zipcode, String lat, String longitude,
                               String phone){
        addNewUser.receiveNewUser(id,email, username, password, firstname, lastname, city, street, number, zipcode, lat, longitude, phone);

    }
}
