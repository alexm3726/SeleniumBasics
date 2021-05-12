package com.syntax.Class06.HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {

    public static String url="http://syntaxtechs.com/selenium-practice/bootstrap-iframe.php";
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.switchTo().frame("FrameOne");
        WebElement header= driver.findElement(By.xpath("//nav[@role='navigation']"));
        boolean text=header.getText().isEmpty();
        System.out.println("Is header text empty: "+text);

        driver.switchTo().defaultContent();
        Thread.sleep(1000);

        driver.switchTo().frame("FrameTwo");

        WebElement enrollButton=driver.findElement(By.xpath("//a[@href='https://www.syntaxtechs.com/enroll/']"));
        System.out.println("Is enroll button enabled? "+enrollButton.isEnabled());

        driver.quit();
    }
}
