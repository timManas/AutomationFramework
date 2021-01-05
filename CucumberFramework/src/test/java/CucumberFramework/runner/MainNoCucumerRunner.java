package CucumberFramework.runner;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainNoCucumerRunner {
	
	static WebDriver driver;
	
	public static void main(String [] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/timmanas/ProgrammingProjects/CucumberFramework/CucumberFramework/src/test/java/CucumberFramework/resources/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		
		
		driver.get("https://stackoverflow.com/");
		driver.findElement(By.xpath("/html//div[@role='menubar']/ol[2]//a[@href='https://stackoverflow.com/users/login?ssrc=head&returnurl=https%3a%2f%2fstackoverflow.com%2f']")).click();
		
		// Enter UserName
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html//input[@id='email']")).sendKeys("timothy.romero.manas@gmail.com");
		
		// Enter Password
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html//input[@id='password']")).sendKeys("06951789s");
		
		
		// Click on Submit button
		driver.findElement(By.xpath("/html//button[@id='submit-button']")).click();
		
		// Verify you are in login page
		Thread.sleep(3000);
		WebElement askQuestionsButton = driver.findElement(By.xpath("/html//div[@id='mainbar']//a[@href='/questions/ask']"));
		Assert.assertEquals(true, askQuestionsButton.isDisplayed());
		
	}
	
	

}
