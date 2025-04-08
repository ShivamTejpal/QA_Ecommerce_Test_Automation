package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();

        // Open your local login.html page
		driver.get("file:///Users/shivamtejpal/Desktop/QA%20Project/login.html");
        	

        // Interact with elements
        driver.findElement(By.id("username")).sendKeys("shivam");
        driver.findElement(By.id("password")).sendKeys("1234");
        driver.findElement(By.id("loginBtn")).click();

        // Optional: wait and close browser
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();

	}

}
