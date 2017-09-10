package com.TestngTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Jenkins {
	
	@Test
	
	public static void startBrowser()
	{
		WebDriver driver=new FirefoxDriver();
		
		
		driver.get("http://testingmasters.com/hrm/symfony/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		
		
		
	}

}
