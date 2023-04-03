package com.library.steps;

import com.library.pages.LoginPage_Michele;
import com.library.utility.BrowserUtil;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US02_StepDefs_Michele {


    LoginPage_Michele login;

    @Given("the {string} is on the home page")
    public void the_is_on_the_home_page(String string) {
        login = new LoginPage_Michele();
        login.loginWithUser(string);
        BrowserUtil.waitFor(2);

     }


    @When("the librarian sees the borrowed books number")
    public void the_librarian_sees_the_borrowed_books_number() {


     }


    @Then("the borrowed books number info should match database")
    public void the_borrowed_books_number_info_should_match_database() {
    }




}
