package com.syntax.Class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class SimpleWindowHandling {

    public static String url="http://accounts.google.com/signup";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        String mainPageHandle= driver.getWindowHandle();
        System.out.println(mainPageHandle+ " size----->"+mainPageHandle.length());
        WebElement helpLink= driver.findElement(By.linkText("Help"));
        helpLink.click();

        Set<String> allWindowHandles= driver.getWindowHandles();// will automatically return LinkedHashSet
        System.out.println(allWindowHandles.size());
        Iterator<String> iterator= allWindowHandles.iterator();
        mainPageHandle =iterator.next();//stepping forward and getting main page window handle
        String helpChildHandle= iterator.next();//stepping forward again and getting child page
        System.out.println(mainPageHandle);
        System.out.println(helpChildHandle);
        Thread.sleep(2000);
        driver.switchTo().window(mainPageHandle);// switching back to current window
        Thread.sleep(1000);
        //driver.close();
        driver.quit();


    }
}
