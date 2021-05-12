package com.syntax.Class05.HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HW2 {
    public static String url="https://ebay.com";
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement allCategoriesDD= driver.findElement(By.name("_sacat"));
        Select allCategories=new Select(allCategoriesDD);
        List<WebElement> categories=allCategories.getOptions();
        for (WebElement category:
             categories) {
            System.out.println(category.getText());
        }
        allCategories.selectByVisibleText("Computers/Tablets & Networking");

        WebElement searchButton=driver.findElement(By.id("gh-btn"));
        searchButton.click();
        WebElement header= driver.findElement(By.className("b-pageheader__text"));
        String text=header.getText();
        System.out.println("Is "+text+" displayed: "+header.isDisplayed());

        driver.quit();


    }
}
