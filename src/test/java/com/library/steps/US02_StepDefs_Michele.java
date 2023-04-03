package com.library.steps;

import com.library.pages.DashboardPage_Michele;
import com.library.pages.LoginPage_Michele;
import com.library.utility.BrowserUtil;
import com.library.utility.DB_Util;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US02_StepDefs_Michele {


    LoginPage_Michele login;
    DashboardPage_Michele dashboard;
    String actualBorrowedBooks;
    String expectedBorrowedBooks;

    @Given("the {string} is on the home page")
    public void the_is_on_the_home_page(String string) {
        login = new LoginPage_Michele();
        login.loginWithUser(string);
        BrowserUtil.waitFor(2);

     }


    @When("the librarian sees the borrowed books number")
    public void the_librarian_sees_the_borrowed_books_number() {
        dashboard = new DashboardPage_Michele();
        actualBorrowedBooks = dashboard.borrowedBooksDisplay.getText();
        System.out.println("actualBorrowedBooks = " + actualBorrowedBooks);

    }


    @Then("the borrowed books number info should match database")
    public void the_borrowed_books_number_info_should_match_database() {
        String query = "SELECT count(*) FROM book_borrow WHERE is_returned = 0";
        DB_Util.runQuery(query);
        expectedBorrowedBooks = DB_Util.getFirstRowFirstColumn();
        System.out.println("expectedBorrowedBooks = " + expectedBorrowedBooks);

        Assert.assertEquals(actualBorrowedBooks, expectedBorrowedBooks);
    }




}
