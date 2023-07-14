package runTme;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

public class commandFile {
    protected WebDriver driver;

    public void open(WebDriver driver, String url) throws IOException {
        try {
            Reporter.log("Navigating to " + url, true);
            driver.get(url);
        } catch (Exception e) {
            System.err.println("Error occurred during the open action");
            throw e;
        }
    }

    public void click(WebDriver driver, By locator) throws IOException {
        try {
            WebElement element = driver.findElement(locator);
            element.click();
        } catch (NoSuchElementException e) {
            Reporter.log("<br/>Element is not present in the webpage: " + locator, true);
            throw e;
        } catch (Exception e) {
            Reporter.log("<br/>Error occurred during the click action: " + locator, true);
            throw e;
        }
    }

    public void type(WebDriver driver, By locator, String value) throws IOException {
        try {
            WebElement element = driver.findElement(locator);
            element.clear();
            element.sendKeys(value);
        } catch (NoSuchElementException e) {
            Reporter.log("<br/>Element is not present in the webpage: " + locator, true);
            throw e;
        } catch (Exception e) {
            Reporter.log("<br/>Error occurred during the type action: " + locator, true);
            throw e;
        }
    }

    public void select(WebDriver driver, By locator, String value) throws IOException {
        try {
            WebElement element = driver.findElement(locator);
            new Select(element).selectByVisibleText(value);
        } catch (NoSuchElementException e) {
            Reporter.log("<br/>Element is not present in the webpage: " + locator, true);
            throw e;
        } catch (Exception e) {
            Reporter.log("<br/>Error occurred during the select action: " + locator, true);
            throw e;
        }
    }

    public void verifyByText(WebDriver driver, By locator, String expectedText) throws IOException {
        try {
            WebElement element = driver.findElement(locator);
            assertEquals(element.getText().trim(), expectedText);
        } catch (NoSuchElementException e) {
            Reporter.log("<br/>Element is not present in the webpage: " + locator, true);
            throw e;
        } catch (Exception e) {
            Reporter.log("<br/>Error occurred during the verifyByText action: " + locator, true);
            throw e;
        }
    }
}
