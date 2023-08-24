package com.stellarelements.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.adkgroup.com/thank-you/")
public class ConfirmationPage extends PageObject {
    @FindBy(xpath= "//h2[text()='Thanks for throwing us a bone.']")
    private WebElementFacade confirmationMessage;

    public String confirmationMessage(){
        return confirmationMessage.getText();
    }
}
