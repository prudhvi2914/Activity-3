import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
	WebDriver driver;
public static void main(String[] args) throws InterruptedException {

		
}  
	
	
	@Before
	public void setUp() throws Exception {
		
		
//		/l 1. setup selenium + your webdriver
//		// Selenium + Chrome
		System.setProperty("webdriver.chrome.driver", 
				"/Users/satramprudhvi/Desktop/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		// 2. go to the website
		driver.get("https://www.mcdonalds.com/ca/en-ca.html");

	}

	@After
	public void tearDown() throws Exception {
		
		// 4. close the browser
				Thread.sleep(1000);
		
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}


	
	
	
	
	
	
	@Test
	public void testcase1() throws InterruptedException  {
		
		
		
		WebElement heading = driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[1]/div[3]/div[1]/div/div[2]/div/div/div/div/div/div[1]/div[1]/h2"));
		String actualheading = heading.getText();
		assertEquals("Subscribe to My McD’s ®",actualheading);
		
		
	}
	

}

