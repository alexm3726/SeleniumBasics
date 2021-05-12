package com.syntax.Class06.HW;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW {
    public static String url="http://syntaxtechs.com/selenium-practice/javascript-alert-box-demo.php";
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        //first button
        WebElement clickMeButton= driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']"));
        clickMeButton.click();
        Alert simpleJSAlert=driver.switchTo().alert();
        Thread.sleep(2000);
        simpleJSAlert.accept();

        //second button
        WebElement clickMeButton2= driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']"));
        clickMeButton2.click();
        Thread.sleep(2000);
        Alert confirmJSAlert=driver.switchTo().alert();
        confirmJSAlert.accept();

        //third button
        WebElement clickMeButton3= driver.findElement(By.xpath("//button[text()='Click for Prompt Box']"));
        clickMeButton3.click();
        Thread.sleep(2000);
        Alert promptAlert=driver.switchTo().alert();
        promptAlert.sendKeys("Baconator3000");
        Thread.sleep(2000);
        promptAlert.accept();
        Thread.sleep(2000);




    }
}
