import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestCases {
	//global variable
	WebDriver driver;


	@Before
	public void setUp() throws Exception {
		

		// 1. setup selenium and  webdriver
		
		System.setProperty("webdriver.chrome.driver", 
				"/Users/satramprudhvi/Desktop/chromedriver");
	    driver = new ChromeDriver();
		
		// 2. go to the website
		driver.get("https://www.mcdonalds.com/ca/en-ca.html");
				
		
	}

	@After
	public void tearDown() throws Exception {
		//closes the driver
		
		Thread.sleep(5000);
		driver.close();
	}
	

	@Test
	public void TC1() throws InterruptedException  {
		//get the headertext
		
		String headerText= driver.findElement(By.className("click-before-outline")).getText();
	//comparing the actual value with expected vale
		assertEquals("Subscribe to My McD’s®",headerText);
		System.out.println("TitleText "+ headerText);
		
		
	}
	
	
	
	@Test
	public void happyPath() throws InterruptedException{
		//get the firstname input box by id 		
	WebElement firstname = driver.findElement(By.id("firstname2"));
	
	//send the input text
	firstname.sendKeys("Prudhvi");
	
	//get the email input box by id
	WebElement email = driver.findElement(By.id("email2"));
	//send email text
	email.sendKeys("prudhvi.satram1995@gmail.com");
	//get the postalcode input box by id
	WebElement postalCode = driver.findElement(By.id("postalcode2"));
	//send keys
	postalCode.sendKeys("  M3A");
	//automatically clicking the button
	WebElement autoClick = driver.findElement(
	By.id("g-recaptcha-btn-2"));
	
	autoClick.click();
	
	
	//auto click the verify button pop-up
	
//	WebElement verifyButtonClick = driver.findElement(
//			By.className("rc-button-default goog-inline-block"));
//			
//	verifyButtonClick.click();
//	//
//	WebDriverWait wait = new WebDriverWait(driver, 30);
//	wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//*[@id=\"recaptcha-verify-button\"]")));
//	WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("\"recaptcha-verify-button\"")));
//	element.click();
	
	
	
	}


	
	
	
	@Test
	public void NegativePath() throws InterruptedException{
		
	//get the firstname input box by id 		

	WebElement nameBox = driver.findElement(By.id("firstname2"));
	//get the firstname input box by id 		

	nameBox.sendKeys("");
//	String name = firstname.getText();
	//get the email input box by id
	String name = nameBox.getText();
	
	WebElement email = driver.findElement(By.id("email2"));
	//send email text
	email.sendKeys("");
	//get the postalcode input box by id

	WebElement postalCode = driver.findElement(By.id("postalcode2"));
	postalCode.sendKeys("   ");
	
	
	
	
	
	//automatically clicking the button
     WebElement autoclick = driver.findElement(
	By.id("g-recaptcha-btn-2"));
	autoclick.click();
	
	
	
	
	}
	
	
	
	
	

}
