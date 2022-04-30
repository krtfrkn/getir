package com.getir.step_definitions;

import com.getir.pages.LoginPage;
import com.getir.utilities.ConfigurationReader;
import com.getir.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class LoginStepDefs {

    LoginPage loginPage = new LoginPage();
    WebDriverWait wait = new WebDriverWait(Driver.get(), 10);
//    public static final String ACCOUNT_SID = ConfigurationReader.get("ACCOUNT_SID");
//    public static final String AUTH_TOKEN = ConfigurationReader.get("AUTH_TOKEN");

    @Given("the user is on the main page")
    public void the_user_is_on_the_main_page() {
        Driver.get().get(ConfigurationReader.get("url"));
    }

    @When("the user selects the phone code")
    public void theUserSelectsThePhoneCode() {
        loginPage.countryCodeArrow.click();
        loginPage.countryCode(ConfigurationReader.get("code")).click();
    }

    @And("the user enters the phone number")
    public void theUserEntersThePhoneNumber() {
        loginPage.phoneBox.sendKeys(ConfigurationReader.get("phoneNumber"));
    }

    @And("the user clicks on the continue button")
    public void theUserClicksOnTheContinueButton()  {
        loginPage.continueButton.click();
    }

    @And("the user enters OTP and clicks on the approve button")
    public void theUserEntersOTPAndClicksOnTheApproveButton() throws InterruptedException {
//        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
//        String smsBody = OTPHandle.getMessage();
//        String OTPNumber = smsBody.replaceAll("[^-?0-9]+", " ");
//        loginPage.otpBox.sendKeys(OTPNumber);
       Thread.sleep(15000); // wait for the sms to arrive and will be entered in the otp box
                                 // in given time
        loginPage.approveButton.click();
        wait.until(ExpectedConditions.titleContains("New Products"));
    }

    @Then("the user should be logged in")
    public void theUserShouldBeLoggedIn() {
        String expectedTitle = "New Products | Getir";
        String actualTitle = Driver.get().getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
    }



}
