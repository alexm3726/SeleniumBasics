package com.syntax.Class04.HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3 {
    /*
    HRMS Application Negative Login:
Open chrome browser
Go to "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login"
Enter valid username
Leave password field empty
Click on login
Verify error message with text "Password cannot be empty" is displayed.
     */
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        WebElement username=driver.findElement(By.cssSelector("input#txtUsername"));
        username.sendKeys("Admin");
        WebElement loginButton= driver.findElement(By.cssSelector("input.button"));
        loginButton.click();
        Thread.sleep(2000);
        WebElement errorMessage= driver.findElement(By.cssSelector("span#spanMessage"));
        boolean errorMessageDisplayed=errorMessage.isDisplayed();
        System.out.println("Error message verification: "+errorMessageDisplayed);
        driver.quit();



    }
}
