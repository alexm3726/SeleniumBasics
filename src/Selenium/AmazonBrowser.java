package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonBrowser {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");// navigate to the specific url
        driver.navigate().to("https://www.Amazon.com/");
        Thread.sleep(1000);// pauses thread fro given amount of milliseconds

        driver.getCurrentUrl();
        String url= driver.getCurrentUrl();
        System.out.println(url);
        String title= driver.getTitle();// gets title of web page
        System.out.println(title);
        //driver.manage().window().maximize();
        driver.manage().window().fullscreen();
        driver.navigate().back();
        Thread.sleep(10000);
        driver.navigate().forward();
        driver.navigate().refresh();
        driver.quit(); //will close whole browser
        //driver.close(); will only close current tab
    }
}
