package com.virgingames.steps;

import com.virgingames.pages.LoginPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class LoginStep {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
    }

    @When("^I accept cookies$")
    public void iAcceptCookies() {
        new LoginPage().clickOnAcceptCookie();
    }
    @And("^I click on Free Games$")
    public void iClickOnFreeGames() {
        new LoginPage().clickOnFreeGames();
    }


    @Then("^I should see text Experience a Selection of Free Games$")
    public void iShouldSeeTextExperienceASelectionOfFreeGames() {
        Assert.assertEquals("Experience a Selection of Free Games","Experience a Selection of Free Games");
        new LoginPage().getTextMessage();
    }
}
