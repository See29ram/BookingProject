package com.booking.Bookingsite;



import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Unit test for simple App.
 */
public class AppTest {
	/**
	 * Rigorous Test :-)
	 * 
	 * @throws InterruptedException
	 */
	@Test
	public void shouldAnswerWithTrue() throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://www.google.com");
		Thread.sleep(2000);
		dr.quit();
	}

}
