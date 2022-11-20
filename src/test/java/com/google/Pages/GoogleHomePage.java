package com.google.Pages;

import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class GoogleHomePage extends BaseTest{

    By lbl_googleLogo = By.xpath("//*[@class = 'lnXdpd']");
    By txtbox_googleSearch = By.xpath("//input[@name = 'q']");
    By btn_Search = By.xpath("(//input[@name='btnK' and @aria-label='Google Search' ])[2]");
    By lbl_googleLogo2 = By.xpath("//*[@class='jfN4p']");

    public GoogleHomePage(WebDriver driver){
        this.driver = driver;
    }

    String parameter = System.getProperty("PARAM_NAME_TEST");
    public void openGoogleHomepage(){
        System.out.println("It is an parameter"+parameter);
        setupdriver(parameter);
        driver.get("https://www.google.com");
    }

    public void verify_google_logo(){
        Assert.assertTrue(driver.findElement(lbl_googleLogo).isDisplayed());
    }

    public void enterSearchtext(String text){
        driver.findElement(txtbox_googleSearch).sendKeys(text);
    }

    public void clickOnSearch(){
        driver.findElement(btn_Search).click();
    }

    public void verifySearchPage(){
        Assert.assertTrue(driver.findElement(lbl_googleLogo2).isDisplayed());
    }
    public void takescreenshot(Scenario scenario) throws IOException {
//        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//        FileUtils.copyFile(scrFile, new File("./image.png"));

        byte [] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.attach(screenshot,"image/png","image attached");




    }
}
