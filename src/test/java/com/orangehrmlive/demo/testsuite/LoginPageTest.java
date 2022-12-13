package com.orangehrmlive.demo.testsuite;

import com.orangehrmlive.demo.customlisteners.CustomListeners;
import com.orangehrmlive.demo.pages.LoginPage;
import com.orangehrmlive.demo.testbase.BaseTest;
import com.orangehrmlive.demo.utility.Utility;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class LoginPageTest extends BaseTest {


    LoginPage loginPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        loginPage = new LoginPage();

    }
    @Test(groups = {"sanity", "regression"})
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        loginPage.enterUsername("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickOnLoginButton();
        Assert.assertEquals(loginPage.getVerifyText(), "Dashboard", "Error Message not displayed");
    }

    @Test(groups = {"sanity", "smoke", "regression"})
    public void userShouldNavigateToForgotPasswordPageSuccessfully() {
        loginPage.clickOnForgotPasswordButton();
        Assert.assertEquals(loginPage.getVerifyText(), "Reset Password", "Dashboard");
    }

}