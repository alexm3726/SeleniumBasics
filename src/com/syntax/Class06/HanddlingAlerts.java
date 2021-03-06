package com.syntax.Class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HanddlingAlerts {
    public static String url="http://uitestpractice.com/Students/Switchto";
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        /*driver.manage().window().maximize();
        WebElement simpleAlertButton= driver.findElement(By.id("alert"));
        simpleAlertButton.click();
        Thread.sleep(2000);
        Alert simpleAlert=driver.switchTo().alert();// switching focus to alert
        simpleAlert.accept();//handling simple alert
        Thread.sleep(2000);

        WebElement confirmButton= driver.findElement(By.id("confirm"));
        confirmButton.click();
        Thread.sleep(2000);
        Alert confirmAlert=driver.switchTo().alert();
        String alertText= confirmAlert.getText();
        System.out.println(alertText);
        confirmAlert.dismiss();
*/

        WebElement promptAlertButton= driver.findElement(By.id("prompt"));
        promptAlertButton.click();
        Thread.sleep(2000);
        Alert promptAlert=driver.switchTo().alert();
        promptAlert.sendKeys("Syntax Techs");
        promptAlert.accept();



    }
}
