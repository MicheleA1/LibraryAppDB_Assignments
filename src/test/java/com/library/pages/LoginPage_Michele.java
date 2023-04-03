package com.library.pages;

import com.library.utility.ConfigurationReader;
import com.library.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_Michele {

    // Introduce Driver to this page in order to access located elements
    public LoginPage_Michele(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //-----------------------------------------webElements-----------------------------------------------------------
    @FindBy (xpath ="//input[@placeholder = 'Email address']" )
    public WebElement emailInputBox;


    @FindBy (xpath = "//input[@placeholder = 'Password']")
    public WebElement passwordInputBox;


    @FindBy (xpath = "//button[.= 'Sign in']")
    public WebElement signInButton;


    //-------------------------------------------methods-----------------------------------------------------------

    public void loginWithUser(String userType){
        String username= ConfigurationReader.getProperty(userType+"_username");
        String password=ConfigurationReader.getProperty(userType+"_password");

        emailInputBox.sendKeys(username);
        passwordInputBox.sendKeys(password);
        signInButton.click();
    }

}
