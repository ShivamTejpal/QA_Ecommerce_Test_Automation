package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 WebDriver driver = new ChromeDriver();

	        
	        driver.get("file:///Users/shivamtejpal/Desktop/QA%20Project/register.html");

	        
	        driver.findElement(By.id("name")).sendKeys("Shivam Tejpal");
	        driver.findElement(By.id("email")).sendKeys("shivam@example.com");
	        driver.findElement(By.id("password")).sendKeys("Password123");
	        driver.findElement(By.id("confirmPassword")).sendKeys("Password123");
	        Thread.sleep(2000);
	        
	        WebElement submit = driver.findElement(By.cssSelector("input[type='submit']"));
	        submit.click();

	        System.out.println("Registration Test Completed!");

	        driver.quit();
	}

}
