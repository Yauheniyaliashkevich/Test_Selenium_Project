package com.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {
    /*
    Open chrome browser
Go to "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login"
Enter valid username and password (username - Admin, password - Hum@nhrm123)
Click on login button
Then verify Syntax Logo is displayed.
     */

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver= new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        //WebElement userName = driver.findElement(By.xpath("//input[@id = 'txtUsername']/following-sibling::span"));
        WebElement userName = driver.findElement(By.xpath("//input[@id = 'txtUsername']"));
        userName.sendKeys("Admin");
        WebElement password = driver.findElement(By.cssSelector("input[id *= 'Password']"));
        password.sendKeys("Hum@nhrm123");
        WebElement loginBtn = driver.findElement(By.cssSelector("input[value= 'LOGIN']"));
        loginBtn.click();
        Thread.sleep(2000);
        WebElement logo =driver.findElement(By.cssSelector("img[alt ^= 'Orange']"));
        boolean isLogoDisplayed = logo.isDisplayed();
        System.out.println(isLogoDisplayed);
        driver.quit();






    }
}
