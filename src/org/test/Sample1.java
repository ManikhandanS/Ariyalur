package org.test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample1
{
public static void main(String[] args) 
{
System.setProperty("webdriver.chrome.driver","C:\\Users\\Manikhandan S\\eclipse-workspace\\Mani\\Drivers\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.redbus.in/ ");
WebElement txtSource=driver.findElement(By.id("src"));
txtSource.sendKeys("CHENNAI");
WebElement txtDestination=driver.findElement(By.id("dest"));
txtDestination.sendKeys("ARIYALUR");
}
}