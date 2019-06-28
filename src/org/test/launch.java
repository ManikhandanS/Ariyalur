package org.test;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class launch 
{
		public static void main(String[] args)
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Manikhandan S\\eclipse-workspace\\Mani\\Drivers\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.greenstechnologys.com//");
			System.out.println("url");
			String ti=driver.getTitle();
			System.out.println(ti);
		}
}
