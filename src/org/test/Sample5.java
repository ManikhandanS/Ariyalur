package org.test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Sample5
{
public static void main(String[] args) 
{
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Manikhandan S\\eclipse-workspace\\Mani\\Drivers\\chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get("http://www.greenstechnologys.com/");
WebElement txt=driver.findElement(By.xpath("//Span[Contains(text()='Greens Technologys OMR')]"));
String name=txt.getText();
System.out.println(name);
driver.quit();
}
}
