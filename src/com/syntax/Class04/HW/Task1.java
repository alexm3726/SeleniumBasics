package com.syntax.Class04.HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/*
Open chrome browser
Go to "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login"
Enter valid username and password (username - Admin, password - Hum@nhrm123)
Click on login button
Then verify Syntax Logo is displayed.
 */
public class Task1 {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        WebElement userName= driver.findElement(By.xpath("//input[@id='txtUsername']"));
        userName.sendKeys("Admin");
        WebElement passWord= driver.findElement(By.xpath("//input[@type='password']"));
        passWord.sendKeys("Hum@nhrm123");
        WebElement logInButton= driver.findElement(By.xpath("//input[@class='button']"));
        logInButton.click();
        Thread.sleep(2000);
        WebElement syntaxLogo= driver.findElement(By.xpath("//img[@alt='OrangeHRM']"));
        boolean syntaxLogoDisplayed=syntaxLogo.isDisplayed();
        System.out.println("Syntax Logo verification: " + syntaxLogoDisplayed);
        driver.quit();

    }
}
