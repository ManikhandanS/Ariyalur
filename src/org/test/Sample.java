package org.test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample
{
public static void main(String[] args) 
{
System.setProperty("webdriver.chrome.driver","C:\\Users\\Manikhandan S\\eclipse-workspace\\Mani\\Drivers\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
WebElement txtUsername=driver.findElement(By.id("email"));
txtUsername.sendKeys("JAVA");
WebElement txtPhoneno=driver.findElement(By.id("email"));
txtPhoneno.sendKeys("9865804510");
WebElement txtPassword=driver.findElement(By.id("Pass"));
txtPassword.sendKeys("HELLO");
driver.quit();
}
}
