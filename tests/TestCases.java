import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCases {
	

		
				


	
	
	
	WebDriver driver;


	@Before
	public void setUp() throws Exception {
		

		// 1. setup selenium + your webdriver
		
		System.setProperty("webdriver.chrome.driver", 
				"/Users/satramprudhvi/Desktop/chromedriver");
	    driver = new ChromeDriver();
		
		// 2. go to the website
		driver.get("https://www.mcdonalds.com/ca/en-ca.html");
		// 3. write code to do some stuff on that website
		
		
	}

	@After
	public void tearDown() throws Exception {
		
		Thread.sleep(5000);
		driver.close();
	}
	

	@Test
	public void TC1() throws InterruptedException  {
		//get the hedaertext
		
		String headerText= driver.findElement(By.className("click-before-outline")).getText();
	//comparing the actual value with expected vale
		assertEquals("Subscribe to My McD’s®",headerText);
		
		
	}
	
	
	
	@Test
	public void TC2() throws InterruptedException{
		//get the firstname input box by id 		
	WebElement firstname = driver.findElement(By.id("firstname2"));
	//send the input text
	firstname.sendKeys("Prudhvi");
//	String name = firstname.getText();
	//get the email input box by id
	WebElement email = driver.findElement(By.id("email2"));
	//send email text
	email.sendKeys("prudhvi.satram1995@gmail.com");
	//get the postalcode input box by id
	WebElement postalCode = driver.findElement(By.id("postalcode2"));
	//send keys
	postalCode.sendKeys("M3A");
	//automatically clicking the button
	WebElement autoClick = driver.findElement(
	By.id("g-recaptcha-btn-2"));
	
	autoClick.click();
	}


	
	
	
	
	
	
//	@Test
//	public void test() {
//		fail("Not yet implemented");
//	}
	
	
	
	
	
	

}
