package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.Register;

public class RegisterSteps {

    @Steps
    Register register;

    @Given("I set API endpoint for register")
    public void setApiEndpoint() {
        register.setApiEndpoint();
    }

    @When("I send request to register")
    public void sendRegisterRequest() {
        register.sendRegisterRequest();
    }

    @And("I receive valid data for register")
    public void receiveValidRegisterData() {
        register.receiveValidRegisterData();
    }
}
