package com.syntax.Class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class AdvancedWindowHandling {
    public static String url="http://syntaxtechs.com/selenium-practice/window-popup-modal-demo.php";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        String mainPageHandle= driver.getWindowHandle();
        WebElement followOnInstagram= driver.findElement(By.linkText("Follow On Instagram"));

        WebElement followOnFB= driver.findElement(By.linkText("Like us On Facebook"));

        WebElement instaAndFB= driver.findElement(By.linkText("Follow Instagram & Facebook"));

        followOnInstagram.click();
        followOnFB.click();
        instaAndFB.click();

        Set<String> allWindowHandles= driver.getWindowHandles();
        System.out.println(allWindowHandles.size());
        Iterator<String> iterator= allWindowHandles.iterator();
        while(iterator.hasNext()){// start iterating through handles
            String Handle= iterator.next();// get the next handle
            if(!Handle.equals(mainPageHandle)){//set a condition
                driver.switchTo().window(Handle);// switch to a window which is not equal to a parent handle
                System.out.println(Handle);
                System.out.println(driver.getTitle());
                driver.close();
            }/*else{
                driver.switchTo().window(Handle);
                System.out.println(Handle);
                System.out.println(driver.getTitle());
            }*/
        }
        driver.switchTo().window(mainPageHandle);//switch back to parent
        followOnInstagram.click();
    }
}
