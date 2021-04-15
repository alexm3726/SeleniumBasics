package com.syntax.Class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {

    /*
    navigate to https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
    fill out the form
    click on register
    close the browser
     */
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.navigate().to("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        WebElement firstName= driver.findElement(By.name("customer.firstName"));
        firstName.sendKeys("Muffin");
        WebElement lastName= driver.findElement(By.id("customer.lastName"));
        lastName.sendKeys("Man");
        WebElement address= driver.findElement(By.id("customer.address.street"));
        address.sendKeys("Drury Lane");
        WebElement city= driver.findElement(By.id("customer.address.city"));
        city.sendKeys("Duloc");
        WebElement state= driver.findElement(By.name("customer.address.state"));
        state.sendKeys("Far Far Away");
        WebElement zipCode= driver.findElement(By.id("customer.address.zipCode"));
        zipCode.sendKeys("123");
        WebElement phoneNumber= driver.findElement(By.name("customer.phoneNumber"));
        phoneNumber.sendKeys("240-555-9999");
        WebElement ssn= driver.findElement(By.id("customer.ssn"));
        ssn.sendKeys("000-00-0007");
        WebElement username= driver.findElement(By.name("customer.username"));
        username.sendKeys("Baconator");
        WebElement password=driver.findElement(By.id("customer.password"));
        password.sendKeys("pass123");
        WebElement confirm= driver.findElement(By.name("repeatedPassword"));
        confirm.sendKeys("pass123");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"customerForm\"]/table/tbody/tr[13]/td[2]/input")).click();
        driver.quit();


    }

}
