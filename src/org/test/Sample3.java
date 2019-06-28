package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample3
{
public static void main(String[] args) 
{
System.setProperty("webdriver.chrome.driver","C:\\Users\\Manikhandan S\\eclipse-workspace\\Mani\\Drivers\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");

WebElement txtUsername=driver.findElement(By.id("email"));
txtUsername.sendKeys("sami.mani10");
WebElement txtpwd=driver.findElement(By.id("pass"));
txtpwd.sendKeys("manikandan1990");
WebElement btnlogin=driver.findElement(By.xpath("//input[@valur'Log In']"));
btnlogin.click();

}
}
