package tests;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		
		driver.get("file:///Users/shivamtejpal/Desktop/QA%20Project/search.html");
		WebElement searchInput = driver.findElement(By.id("product"));
        searchInput.sendKeys("Wireless Mouse");
        WebElement searchBtn = driver.findElement(By.cssSelector("input[type='submit']"));
        searchBtn.click();
        Thread.sleep(1000);
        WebElement result = driver.findElement(By.id("result"));
        String resultText = result.getText();
        if (resultText.contains("Wireless Mouse")) {
            System.out.println("Search test passed!");
        } else {
            System.out.println("Search test failed!");
        }

        driver.quit();
	}

}
