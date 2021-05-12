package com.syntax.Class07.HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class HW1 {

    /*
    Go to https://demoqa.com/browser-windows
            click on New Tab and print the text from new tab in the console
            click on New Window and print the text from new window in the console
            click on New Window Message and print the text from new window in the console
            Verify the title is displayed
            Print out the title of the all pages
     */

    public static String url="https://demoqa.com/browser-windows";

    public static void main(String[] args) throws InterruptedException{
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement tabButton= driver.findElement(By.id("tabButton"));
        WebElement newWindowButton= driver.findElement(By.id("windowButton"));
        WebElement windowMessageButton= driver.findElement(By.id("messageWindowButton"));
        //tabButton.click();
        newWindowButton.click();
        //windowMessageButton.click();
        Thread.sleep(2000);


        Set<String> allWindowHandles= driver.getWindowHandles();
        System.out.println(allWindowHandles.size());
        Iterator<String> iterator= allWindowHandles.iterator();
        String mainPageHandle=iterator.next();
        String newWindowHandle=iterator.next();
        driver.switchTo().window(newWindowHandle);
        Thread.sleep(2000);
        WebElement textNewWindow= driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
        System.out.println(textNewWindow.getText()+" is the text \n"+driver.getTitle()+" is the title");
        driver.switchTo().window(mainPageHandle);
        windowMessageButton.click();
        Thread.sleep(1000);
        Set<String> threeWindowHandles= driver.getWindowHandles();
        System.out.println(threeWindowHandles.size());
        Iterator<String> iterator1=threeWindowHandles.iterator();
        mainPageHandle=iterator1.next();
        newWindowHandle=iterator1.next();
        String windowMessageHandle=iterator1.next();
        driver.switchTo().window(windowMessageHandle);
        Thread.sleep(2000);
        WebElement text1= driver.findElement(By.tagName("body"));
        System.out.println(text1.getText());



        /*while(iterator.hasNext()){
            String handle= iterator.next();
            driver.switchTo().window(handle);
            WebElement text= driver.findElement(By.id("sampleHeading"));
            if(text.toString().equals("This is a sample page")){
                System.out.println(text.getText()+" is is the text" + driver.getTitle()+ " is the Title of the tab.");
            }
        }*/
    }
}
