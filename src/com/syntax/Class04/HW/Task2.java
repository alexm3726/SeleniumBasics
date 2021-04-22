package com.syntax.Class04.HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Task2 {
/*
Open chrome browser
Go to "https://www.amazon.com/"
Get all links
Get number of links that has text
Print to console only the links that has text
 */
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com/");
        List<WebElement> allLinks=driver.findElements(By.tagName("a"));
        int count=0;
        for(WebElement link:allLinks){
            String linkWithText=link.getText();
            String hyperLink=link.getAttribute("href");

            if(!linkWithText.isEmpty()){
                System.out.println(linkWithText+"--"+hyperLink);
                count++;
            }

        }
        System.out.println("Number of links with text are "+count+" out of " +allLinks.size()+ " links");
        driver.quit();
    }
}
