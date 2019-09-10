import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
	
	
	public static void main(String[] args) throws InterruptedException {
		// 1. setup selenium + your webdriver
		// Selenium + Chrome
		System.setProperty("webdriver.chrome.driver", 
				"/Users/satramprudhvi/Desktop/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		// 2. go to the website
		driver.get("https://www.mcdonalds.com/ca/en-ca.html");
	
		
		
		//Get the firstname text box and put your firstname
		WebElement inputBox = driver.findElement(By.id("firstname2"));
		// - TYPE NONSESE INTO THE BOX
		inputBox.sendKeys("Prudhvi");
		
		//Get the email text box and put your emailaddress
		WebElement inputBox2 = driver.findElement(By.id("email2"));
		inputBox2.sendKeys("prudhvi.satram1995@gmail.com");
		
		
		//Get the pin-code text box and put your pincode
				WebElement inputBox3 = driver.findElement(By.id("postalcode2"));
				// - TYPE NONSESE INTO THE BOX
				inputBox3.sendKeys("M3A");
		
		
		// 3b. Automagically push the submit button 
		// -------------------------------------------------
		// - GET the button
		WebElement showMessageButton = driver.findElement(
				By.id("g-recaptcha-btn-2"));
		// - PUSH the button
		showMessageButton.click();
		
		// 4. close the browser
		Thread.sleep(5000);
		driver.close();
		
		
		
	


		
		
	}

}
