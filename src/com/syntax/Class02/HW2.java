package com.syntax.Class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class HW2 {

    /*
    navigate to fb.com
    click on create new account
    fill up all the textboxes
    click on sign up button
    close the pop up
    close the browser
     */

    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com");
        WebElement createNewAccount= driver.findElement(By.linkText("Create New Account"));
        driver.manage().window().maximize();
        createNewAccount.click();
        Thread.sleep(2000);
        WebElement firstName= driver.findElement(By.name("firstname"));
        firstName.sendKeys("Joe");
        WebElement lastName= driver.findElement(By.name("lastname"));
        lastName.sendKeys("Momma");
        WebElement phoneOrEmail= driver.findElement(By.name("reg_email__"));
        phoneOrEmail.sendKeys("JM@Bacon.com");
        WebElement confirmEmail= driver.findElement(By.name("reg_email_confirmation__"));
        confirmEmail.sendKeys("JM@Bacon.com");
        WebElement password= driver.findElement(By.id("password_step_input"));
        password.sendKeys("pass123");
        Thread.sleep(2000);
        WebElement signUp= driver.findElement(By.name("websubmit"));
        signUp.click();
        Thread.sleep(2000);
        WebElement x= driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/img"));
        x.click();
        Thread.sleep(2000);
        driver.quit();

    }
}

