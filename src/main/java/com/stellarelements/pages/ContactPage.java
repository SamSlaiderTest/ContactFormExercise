package com.stellarelements.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://adkgroup:mydevsite@adkcw-wp.adkalpha.com/contact/")
public class ContactPage extends PageObject{
    @FindBy(id = "firstname")
    private WebElementFacade firstNameInput;

    @FindBy(id = "lastname")
    private WebElementFacade lastNameInput;

    @FindBy(id = "email")
    private WebElementFacade emailInput;

    @FindBy(id = "company")
    private WebElementFacade companyInput;

    @FindBy(id = "phone")
    private WebElementFacade phoneInput;

    @FindBy(id = "message")
    private WebElementFacade messageInput;

    @FindBy(css = ".js-form-submit")
    private WebElementFacade submitButton;
    @FindBy(id = "onetrust-close-btn-container")
    private WebElementFacade closeBannerButton;

    @FindBy(xpath = "//span[@role='alert' and text()='This field is required']")
    private WebElementFacade requiredFieldMsg;

    @FindBy(xpath = "//span[@role='alert' and text()='Incorrect format']")
    private WebElementFacade  inCorrectEmailFormat;

    public void enterFirstName(String firstName) {
        firstNameInput.type(firstName);
    }

    public void enterLastName(String lastName) {
        lastNameInput.type(lastName);
    }

    public void enterEmail(String email) {
        emailInput.type(email);
    }

    public void enterCompany(String company) {
        companyInput.type(company);
    }

    public void enterPhone(String phone) {
        phoneInput.type(phone);
    }

    public void enterMessage(String message) {
        messageInput.type(message);
    }

    public void submitForm(){
        submitButton.click();
    }
    public void closeBanner(){
        closeBannerButton.click();
    }

    public String requiredField(){return requiredFieldMsg.getText();}

    public String incorrectEmailFormat(){return inCorrectEmailFormat.getText();}
}
