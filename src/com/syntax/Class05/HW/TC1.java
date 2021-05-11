package com.syntax.Class05.HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TC1 {
    /*
    Facebook dropdown verification
Open chrome browser
Go to “https://www.facebook.com”
click on create new account
Verify:
month dd has 12 month options
day dd has 31 day options
year dd has 115 year options
Select your date of birth
Quit browser
     */

    public static String url="https://facebook.com";
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement createAccountButton= driver.findElement(By.xpath("//*[contains(@id,'u_0_2')]"));
        Thread.sleep(1000);
        createAccountButton.click();
        Thread.sleep(1000);
        WebElement months= driver.findElement(By.id("month"));
        Select select=new Select(months);
        List<WebElement> monthOptions= select.getOptions();
        for (WebElement month: monthOptions) {
            String optionText= month.getText();
            if(optionText.matches("(Jan|Feb|Mar|Apr|May|Jun|Jul|Aug|Sep|Oct|Nov|Dec)")){
                System.out.println(optionText);

            }


        }
        System.out.println("There are 12 options one for each month");
        select.selectByVisibleText("Dec");
        System.out.println("============================Days DropDown=================");
        Thread.sleep(1000);

        WebElement days= driver.findElement(By.id("day"));
        Select daySelect=new Select(days);
        List<WebElement> daysOptions=daySelect.getOptions();
        //System.out.println(daysOptions.size());
        Iterator<WebElement> iterator=daysOptions.iterator();

        while (iterator.hasNext()){
            WebElement str= iterator.next();
            String strText=str.getText();
            System.out.println(strText);
            if(str.getAttribute("value").equals("31")){
                System.out.println("there are 31 days to choose from");
            }


        }
        daySelect.selectByVisibleText("31");

        System.out.println("==================Years Dropdown===========");

        WebElement years= driver.findElement(By.id("year"));
        Select yearsSelect=new Select(years);
        List<WebElement> yearsOptions=yearsSelect.getOptions();
        System.out.println(yearsOptions.size());
        for (int i = 0; i < yearsOptions.size(); i++) {
            WebElement element=yearsOptions.get(i);
            System.out.println(element.getText());

        }
        System.out.println("There are "+ (yearsOptions.size()-1)+" years to choose from");
        yearsSelect.selectByVisibleText("1991");

        Thread.sleep(2000);

        driver.quit();











    }
}
