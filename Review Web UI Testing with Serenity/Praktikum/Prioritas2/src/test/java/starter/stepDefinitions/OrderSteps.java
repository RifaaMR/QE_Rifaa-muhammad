package starter.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.login.*;

public class OrderSteps {
    @Steps
    Product product;
    @Steps
    Transaction transaction;
    @Steps
    Payment payment;
    @And("I enter {string} at form field")
    public void i_enter_at_form_field(String string) {
        product.enterPulsa(string);
    }
    @And("I select the first pulsa package")
    public void i_select_the_first_pulsa_package() {
        product.selectNominal();
    }
    @Then("I will be directed to payment page")
    public void i_will_be_directed_to_payment_page() {
        transaction.checkCheckoutDetail();
    }
    @When("I enter valid {string} at form field")
    public void i_enter_valid_at_form_field(String string) {
        transaction.typeEmailForm(string);
    }
    @And("I select payment method")
    public void i_select_payment_method() {
        transaction.pressCheckbox();
    }
    @And("I select Bayar Sekarang button")
    public void i_select_bayar_sekarang_button() {
        transaction.pressPayButton();
    }
    @Then("I will be directed to finish transaction page")
    public void i_will_be_directed_to_finish_transaction_page() {
        payment.checkBackButtonExist();
    }
}
