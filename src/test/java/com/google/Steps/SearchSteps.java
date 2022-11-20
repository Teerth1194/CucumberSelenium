package com.google.Steps;

import com.google.Pages.GoogleHomePage;
import io.cucumber.core.options.CucumberProperties;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class SearchSteps {

    WebDriver driver;
    GoogleHomePage homePage;
    //Scenario sc;
    @Given("user able to navigate to google")
    public void user_able_to_navigate_to_google() {
        homePage = new GoogleHomePage(driver);
        homePage.openGoogleHomepage();
    }

    @Given("user able to see google logo")
    public void user_able_to_see_google_logo() {

        homePage.verify_google_logo();
    }

    @When("^user enter (.*) in google textbox$")
    public void user_enter_automation_in_google_textbox(String str) {
        homePage.enterSearchtext(str);
    }

    @When("click in search button")
    public void click_in_search_button() {
        homePage.clickOnSearch();
    }

    @Then("verify if search page will be displayed")
    public void verify_if_search_page_will_be_displayed() {
        homePage.verifySearchPage();

    }

    @After
    public void cleanup(Scenario scenario) throws IOException {
       // this.sc = scenario;
        homePage.takescreenshot(scenario);
        homePage.quitDriver();
    }
}
