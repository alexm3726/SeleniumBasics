package com.syntax.Class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        driver.findElement(By.id("ctl00_MainContent_username" )).sendKeys("Tester");
        driver.findElement(By.id("ctl00_MainContent_password" )).sendKeys("test");
        driver.findElement(By.id("ctl00_MainContent_login_button")).click();
        String title=driver.getTitle();
        if(title.equalsIgnoreCase("Web Orders")){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
        Thread.sleep(2000);
        driver.findElement(By.linkText("Logout")).click();
        driver.quit();
    }
}
