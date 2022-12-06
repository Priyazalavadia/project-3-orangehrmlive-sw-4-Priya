package com.orangehrmlive.testsuite;

import com.orangehrmlive.Pages.LoginPage;
import com.orangehrmlive.testbase.BaseTest;
import org.apache.commons.lang3.builder.ToStringExclude;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {

    LoginPage loginPage = new LoginPage();


@Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){
    //login with valid username
    loginPage.enterUserName("Admin");

    //login with valid password
    loginPage.enterPassword("admin123");

    //click on loginbutton
    loginPage.loginButton();

    //verify Dashboard text
    String expectedText = "Dashboard";
    String actualText = loginPage.verifyMessage();
    Assert.assertEquals(actualText,expectedText,"page not displayed");
}

}
