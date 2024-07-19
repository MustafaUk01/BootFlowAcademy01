package BootFlowSelenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;


public class Test01 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get( "http://eaapp.somee.com/" );
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
// Login as admin
        WebElement login = driver.findElement(By.id("loginLink"));
        login.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        WebElement UserName = driver.findElement(By.id("UserName"));
        UserName.sendKeys("admin");
        WebElement password = driver.findElement(By.id("Password"));
        password.sendKeys("password");
        WebElement logIn = driver.findElement(By.cssSelector("input[value=\"Log in\"]"));
        logIn.click();
        
        
        //Go to Employee List page
        WebElement EmployeeList = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/ul/li[3]/a"));
        EmployeeList.click();
        
        
        //Create a new employee
        WebElement CreateEmployee = driver.findElement(By.xpath("/html/body/div[2]/form/a"));
        CreateEmployee.click();
        WebElement name = driver.findElement(By.id("Name"));
        name.sendKeys("Aaron");
        WebElement Salary  = driver.findElement(By.id("Salary"));
        Salary.sendKeys("5000");
        WebElement DurationWorked   = driver.findElement(By.id("DurationWorked"));
        DurationWorked.sendKeys("90");
        WebElement Grade    = driver.findElement(By.xpath("//*[@id=\"Grade\"]/option[4]"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        WebElement Email    = driver.findElement(By.xpath("//*[@id=\"Email\"]"));
        Email.sendKeys("wepeg42225@reebsd.com");
        WebElement create = driver.findElement(By.xpath("/html/body/div[2]/form/div/div[6]/div/input"));
        create.submit();
        
      //  Verify the new employee info in Employee List page
      
      
      
      
      
      
      
      
      
      
      
      
    }
    
    
    
    
    
    
}
