package com.getir.pages;

import com.getir.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(xpath = "//div[@class='arrow']")
    public WebElement countryCodeArrow;

    @FindBy(name = "gsm")
    public WebElement phoneBox;

    @FindBy(xpath = "//button[.='Continue with phone number']")
    public WebElement continueButton;

    @FindBy(name = "otp")
    public WebElement otpBox;

    @FindBy(xpath = "//button[.='Approve and login']")
    public WebElement approveButton;

    public WebElement countryCode(String countryCode) {
        return Driver.get().findElement(By.xpath("//span[.='"+countryCode+"']"));
    }
}
