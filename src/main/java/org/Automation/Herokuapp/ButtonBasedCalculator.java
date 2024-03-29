package org.Automation.Herokuapp;

import org.Automation.utils.TestBase;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class ButtonBasedCalculator extends TestBase {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://testpages.herokuapp.com/styled/apps/calculator.html");

        WebElement num1 = driver.findElement(By.cssSelector("#number01"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", num1);
        driver.findElement(By.cssSelector("#number01")).sendKeys("1");
        WebElement num2 = driver.findElement(By.cssSelector("#number02"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", num2);
        driver.findElement(By.cssSelector("#number02")).sendKeys("2");
        WebElement calculate = driver.findElement(By.cssSelector("#buttonplus"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", calculate);
        driver.findElement(By.cssSelector("#buttonplus")).click();
        WebElement equals = driver.findElement(By.cssSelector("#buttonequals"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", equals);
        driver.findElement(By.cssSelector("#buttonequals")).click();


    }
}
