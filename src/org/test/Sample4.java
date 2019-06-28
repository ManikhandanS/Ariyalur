package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample4
{
public static void main(String[] args) 
{
System.setProperty("webdriver.chrome.driver","C:\\Users\\Manikhandan S\\eclipse-workspace\\Mani\\Drivers\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.toolsqa.com/automation-practice-form/");

WebElement txtUsername=driver.findElement(By.name("firstname"));
txtUsername.sendKeys("Manikhandan");
WebElement txtpwd=driver.findElement(By.name("lastname"));
txtpwd.sendKeys("S");
WebElement btnlogin=driver.findElement(By.xpath("//input[@value='Male']"));
btnlogin.click();
WebElement txtexp=driver.findElement(By.id("exp-3"));
txtexp.click();
WebElement date=driver.findElement(By.id("datepicker"));
date.sendKeys("19/06/2019");
driver.quit();

}
}

