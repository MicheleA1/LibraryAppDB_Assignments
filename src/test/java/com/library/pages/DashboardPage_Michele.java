package com.library.pages;

import com.library.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage_Michele {

    // introducing driver to this page to access located elements
    public DashboardPage_Michele() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    //-----------------------------------------webElements-----------------------------------------------------------

    @FindBy (xpath = "//h2[@id= 'borrowed_books']")
    public WebElement borrowedBooksDisplay;
}
