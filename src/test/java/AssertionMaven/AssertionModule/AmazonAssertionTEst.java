package AssertionMaven.AssertionModule;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class AmazonAssertionTEst {
	
	@Test
	public void amazon() {
		System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver.exe\\");
		WebDriver driver= new ChromeDriver();
		 driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
		String actual_title = driver.getTitle();
		System.out.println(actual_title);
		String Expected_title="Amazon.com. Spend less. Smile more.";
		Assert.assertEquals(Expected_title, actual_title);
		
		System.out.println("Title matched");
		Assert.assertNotNull(Expected_title);
		System.out.println("Expected_title is not null");
		driver.quit();
		
	}
	}


