package steps;

import com.stellarelements.pages.ConfirmationPage;
import com.stellarelements.pages.ContactPage;
import net.thucydides.core.annotations.Step;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.equalTo;
public class ContactFormSteps {

    ContactPage contactPage;
    ConfirmationPage confirmationPage;

    @Step
    public void openContactPage() {
        contactPage.open();
    }

    @Step
    public void enterValidFormData() {
        contactPage.enterFirstName("Peptio");
        contactPage.enterLastName("Perez");
        contactPage.enterEmail("pepito.perez@myemail.com");
        contactPage.enterCompany("My Company");
        contactPage.enterPhone("9876543210");
        contactPage.enterMessage("Message Message Message");
    }

    @Step
    public void submitForm() {
        contactPage.closeBanner();
        contactPage.submitForm();
    }

    @Step
    public void shouldBeShownConfirmation() {
        String message = confirmationPage.confirmationMessage();
        assertThat(message, is(equalTo("Thanks for throwing us a bone.")));
    }

    @Step
    public void enterValidFormDataWithoutFirstName() {
        contactPage.enterFirstName("");
        contactPage.enterLastName("Perez");
        contactPage.enterEmail("pepito.perez@myemail.com");
        contactPage.enterCompany("My Company");
        contactPage.enterPhone("9876543210");
        contactPage.enterMessage("Message Message Message");
    }

    @Step
    public void enterFormDataWithWrongEmail() {
        contactPage.enterFirstName("Pepito");
        contactPage.enterLastName("Perez");
        contactPage.enterEmail("pepito.perezemail.com");
        contactPage.enterCompany("My Company");
        contactPage.enterPhone("9876543210");
        contactPage.enterMessage("Message Message Message");
    }

    @Step
    public void shouldBeShownRequiredFieldMessage() {
        String message = contactPage.requiredField();
        assertThat(message, is(equalTo("This field is required")));
    }

    @Step
    public void shouldBeShownInvalidEmailFormatMessage() {
        String message = contactPage.incorrectEmailFormat();
        assertThat(message, is(equalTo("Incorrect format")));
    }
}
