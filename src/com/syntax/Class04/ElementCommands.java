package com.syntax.Class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementCommands {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver= new ChromeDriver();
        driver.get("http://syntaxtechs.com/selenium-practice/basic-radiobutton-demo.php");
        WebElement ageRadioButton = driver.findElement(By.cssSelector("input[value= '0 - 5']"));
        boolean isAgeRadioButtonEnabled= ageRadioButton.isEnabled();
        System.out.println(isAgeRadioButtonEnabled);

        if(!isAgeRadioButtonEnabled){
            System.out.println("not enabled");
        }else{
            System.out.println(" it is enabled");
        }

        boolean isAgeRadioButtonDisplayed= ageRadioButton.isDisplayed();
        System.out.println(isAgeRadioButtonDisplayed);
        boolean isAgeRadioButtonSelected= ageRadioButton.isSelected();
        System.out.println("Before Clicking "+ isAgeRadioButtonSelected);
        ageRadioButton.click();
        isAgeRadioButtonSelected = ageRadioButton.isSelected();
        System.out.println("After Clicking "+ isAgeRadioButtonSelected);

        driver.quit();

    }
}
