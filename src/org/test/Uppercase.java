package org.test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Uppercase {
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Manikhandan S\\eclipse-workspace\\Mani\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Takescreenshot tk=(Takescreenshot)driver;
		File s=tk.getScreenshotAs(OutpuType.FILE);
		System.out.println(s);
		File d=new File("E:\\mani");
		FileUtils.copyfiles(s,d);
		driver.quit();		
	
	}
	

}
