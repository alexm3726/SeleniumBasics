package com.syntax.Class05.HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HW1 {
    public static String url="https://facebook.com";
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement createAccountButton= driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
        createAccountButton.click();
        Thread.sleep(1000);
        WebElement firstName= driver.findElement(By.name("firstname"));
        firstName.sendKeys("Joe");
        WebElement lastName= driver.findElement(By.name("lastname"));
        Thread.sleep(1000);
        lastName.sendKeys("Momma");
        WebElement email= driver.findElement(By.name("reg_email__"));
        Thread.sleep(1000);
        email.sendKeys("bro@bacon.com");
        WebElement emailConfirm= driver.findElement(By.name("reg_email_confirmation__"));
        Thread.sleep(1000);
        emailConfirm.sendKeys("bro@bacon.com");
        WebElement password= driver.findElement(By.id("password_step_input"));
        Thread.sleep(1000);
        password.sendKeys("pass123");
        WebElement monthDD= driver.findElement(By.id("month"));
        Select months=new Select(monthDD);
        months.selectByVisibleText("Dec");
        WebElement daysDD=driver.findElement(By.name("birthday_day"));
        Select days=new Select(daysDD);
        days.selectByValue("31");
        WebElement yearDD= driver.findElement(By.xpath("//select[@title='Year']"));
        Select years=new Select(yearDD);
        years.selectByIndex(54);
        Thread.sleep(1000);
        WebElement customButton= driver.findElement(By.xpath("//input[@value='2']"));
        customButton.click();
        Thread.sleep(1000);
        WebElement signUpButton= driver.findElement(By.name("websubmit"));
        signUpButton.click();
        driver.quit();
    }
}
