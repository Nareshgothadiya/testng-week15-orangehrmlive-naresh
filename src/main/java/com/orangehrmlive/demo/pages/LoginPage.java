package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class LoginPage extends Utility {
    @CacheLookup
    @FindBy(name = "username")
    WebElement usernameField;
    // By usernameField = By.name("username");
    @CacheLookup
    @FindBy(name = "password")
    WebElement passwordField;
    //By passwordField = By.name("password");
    @CacheLookup
    @FindBy(xpath = "//button[contains(@class,'oxd-button oxd-button--medium')]")
    WebElement loginButton;
    //ByloginButton = By.xpath("//button[contains(@class,'oxd-button oxd-button--medium')]");
    @CacheLookup
    @FindBy(xpath = "//h6[contains(@class,'oxd-text oxd-text--h6')]")
    WebElement verifyText;
    // By verifyText = By.xpath("//h6[contains(@class,'oxd-text oxd-text--h6')]");
    @CacheLookup
    @FindBy(xpath = "//p[text()='Forgot your password? ']")
    WebElement forgotPassword;
    //By forgotPassword = By.xpath("//p[text()='Forgot your password? ']");

    public void enterUsername(String email) {
        Reporter.log("enterUsername" + usernameField.toString());
        sendTextToElement(usernameField, email);
    }

    public void enterPassword(String password) {
        Reporter.log("enterPassword" + passwordField.toString());
        sendTextToElement(passwordField, password);
    }

    public void clickOnLoginButton() {
        Reporter.log("clickOnLoginButton" + loginButton.toString());
        clickOnElement(loginButton);
    }

    public String getVerifyText() {
        Reporter.log("getVerifyText" + verifyText.toString());
        return getTextFromElement(verifyText);
    }

    public void clickOnForgotPasswordButton() {
        Reporter.log("clickOnForgotPasswordButton" + forgotPassword.toString());
        clickOnElement(forgotPassword);
    }
}