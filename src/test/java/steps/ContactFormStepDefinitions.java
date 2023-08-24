package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class ContactFormStepDefinitions {

    @Steps
    ContactFormSteps contactFormSteps;

    @Given("Marco is on the contact page")
    public void marcoIsOnTheContactPage() {
        contactFormSteps.openContactPage();
    }

    @When("he enter valid data into the form")
    public void heEnterValidDataIntoTheForm() {
        contactFormSteps.enterValidFormData();
    }

    @When("he submit the form")
    public void heSubmitTheForm() {
        contactFormSteps.submitForm();
    }

    @Then("he should see a confirmation of successful submission")
    public void heShouldSeeAConfirmationOfSuccessfulSubmission() {
        contactFormSteps.shouldBeShownConfirmation();
    }

    @When("he provides all details except the First Name")
    public void heProvidesAllDetailsExceptTheFirstName() {
        contactFormSteps.enterValidFormDataWithoutFirstName();
    }
    @Then("he should be unsuccessful and highlight missing First Name")
    public void heShouldBeUnsuccessfulAndHighlightMissingFirstName() {
        contactFormSteps.shouldBeShownRequiredFieldMessage();
    }

    @When("he enters valid details for all fields except the Email")
    public void heEntersValidDetailsForAllFieldsExceptTheEmail() {
        contactFormSteps.enterFormDataWithWrongEmail();
    }
    @When("he attempts to submit the form")
    public void heAttemptsToSubmitTheForm() {
        contactFormSteps.submitForm();
    }
    @Then("he should be halted and alerted to correct the email format")
    public void heShouldBeHaltedAndAlertedToCorrectTheEmailFormat() {
        contactFormSteps.shouldBeShownInvalidEmailFormatMessage();
    }
}
