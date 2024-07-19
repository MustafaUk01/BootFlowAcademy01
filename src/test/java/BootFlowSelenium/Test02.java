package BootFlowSelenium;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
public class Test02 {
public static void main(String[] args) {

WebDriver driver = new ChromeDriver();
driver.get( "http://eaapp.somee.com/" );
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
WebElement login = driver.findElement(By.id("loginLink"));
login.click();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
WebElement UserName = driver.findElement(By.id("UserName"));
UserName.sendKeys("admin");
WebElement password = driver.findElement(By.id("Password"));
password.sendKeys("password");
WebElement logIn = driver.findElement(By.cssSelector("input[value=\"Log in\"]"));
logIn.click();


//Verify the new employee info in Employee List page
WebElement EmplooList = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/ul/li[3]/a"));
EmplooList.click();
WebElement searchbox = driver.findElement(By.name("searchTerm"));
searchbox.sendKeys("Aaron");
WebElement search = driver.findElement(By.xpath("/html/body/div[2]/form/input[2]"));
search.click();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
WebElement employeecall  = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr[2]/td[1]"));
String employeename = employeecall.getText();
if(employeename.equals("Aaron")){
System.out.println("New employee has been successfully verified.");
}else{
System.out.println("New employee verification failed.");


//Delete the new employee
WebElement delete = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr[2]/td[6]/a[3]"));
delete.click();

//Verify the new employee deleted in Employee List page

Assertions.assertFalse(employeename.contains("Aaron"));



















}


}}
