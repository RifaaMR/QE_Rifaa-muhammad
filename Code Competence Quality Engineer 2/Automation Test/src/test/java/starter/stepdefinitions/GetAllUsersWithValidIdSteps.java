package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.GetAllUsersWithValidId;

public class GetAllUsersWithValidIdSteps {

    @Steps
    GetAllUsersWithValidId getAllUsersWithValidId;

    @Given("I set API endpoint for get all users")
    public void setApiGetValidId (){
        getAllUsersWithValidId.setApiGetValidId();
    }


    @When("I send request to get all users")
    public void sendGetAllUsersValidId() {
        getAllUsersWithValidId.sendGetAllUsersValidId();
    }

    @And("I receive valid data for all users")
    public void receiveValidUsersData() {
        getAllUsersWithValidId.receiveValidUsersData();
    }
}
