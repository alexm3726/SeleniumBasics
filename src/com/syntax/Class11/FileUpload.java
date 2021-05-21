package com.syntax.Class11;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {
    public static String url = "http://the-internet.herokuapp.com/";
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        WebElement fileUpload= driver.findElement(By.linkText("File Upload"));
        fileUpload.click();

        WebElement chooseFile= driver.findElement(By.id("file-upload"));
        chooseFile.sendKeys("/Users/alex/Downloads/IAMLORDVOLDEMORT.png");
        WebElement upload= driver.findElement(By.id("file-submit"));
        upload.click();
    }

}

