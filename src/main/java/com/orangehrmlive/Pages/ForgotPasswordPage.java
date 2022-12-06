package com.orangehrmlive.Pages;

import com.orangehrmlive.utility.Utility;
import org.openqa.selenium.By;

public class ForgotPasswordPage extends Utility {

    By usernameField = By.name("username");

    public void enterUserName(String name){
        sendTextToElement(usernameField,name);
    }

    By passwordField = By.name("password");

    public void enterPassword(String password){
        sendTextToElement(passwordField,password);
    }

    By clickOnLoginButton = By.xpath("//button[normalize-space()='Login']");

    public void loginButton(){
        clickOnElement(clickOnLoginButton);

    }

    By clickOnForgotYourPassword = By.xpath("//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']");

    public void forgotPassword(){
        clickOnElement(clickOnForgotYourPassword);
    }

    By verifyResetPassword = By.xpath("//h6[normalize-space()='Reset Password']");

    public String verifyMessage(){
        return getTextFromElement(verifyResetPassword);




    }


}
