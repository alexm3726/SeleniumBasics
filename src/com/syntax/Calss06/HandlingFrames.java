package com.syntax.Calss06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames {


        public static String url="http://uitestpractice.com/Students/Switchto";
        public static void main(String[] args) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
            WebDriver driver = new ChromeDriver();
            driver.get(url);
            driver.switchTo().frame(0);
            WebElement textBox= driver.findElement(By.id("name"));
            textBox.sendKeys("Covid sucks");

            driver.switchTo().defaultContent();

            WebElement alertButton=driver.findElement(By.id("alert"));
            alertButton.click();
            Alert alert=driver.switchTo().alert();
            alert.accept();
            Thread.sleep(2000);

            driver.switchTo().frame("iframe_a");
            textBox.clear();
            Thread.sleep(2000);
            textBox.sendKeys("Selenium Rocks");

            driver.switchTo().defaultContent();
            Thread.sleep(1000);
            WebElement frameElement=driver.findElement(By.xpath("//iframe[@src='/Demo.html']"));
            driver.switchTo().frame(frameElement);
            textBox.clear();
            Thread.sleep(1000);
            textBox.sendKeys("Syntax techs");
            Thread.sleep(1000);

            driver.quit();

    }
}
