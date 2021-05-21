package com.syntax.Class11;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class JSExecutorDemo3 {

    public static String url = "http://www.google.com";
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();


        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.open();");
        driver.get(url);
        WebElement search= driver.findElement(By.name("q"));
        search.sendKeys("gvkvdjvdba");
        Set<String> handles=driver.getWindowHandles();
        System.out.println(handles);
        Iterator<String> iterator= handles.iterator();
        String first= iterator.next();
        String second= iterator.next();


        driver.switchTo().window(second);
        driver.navigate().to(url);

    }

}
