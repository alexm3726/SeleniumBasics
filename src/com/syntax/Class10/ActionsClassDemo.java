package com.syntax.Class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassDemo {

    public static String url = "http://amazon.com";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement accountsAndLists= driver.findElement(By.id("nav-link-accountList"));
        Actions action= new Actions(driver);
        action.moveToElement(accountsAndLists).perform();
        WebElement accountLink= driver.findElement(By.linkText("Account"));
        accountLink.click();
    }
}
