import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AddToCartTest {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--allow-file-access-from-files");

        WebDriver driver = new ChromeDriver(options);

        driver.get("file:///Users/shivamtejpal/Desktop/QA%20Project/products.html");

        // Click on "Add to Cart" button for Product 1
        WebElement addToCartBtn = driver.findElement(By.id("addToCart1"));
        addToCartBtn.click();

        // Handle the alert
        driver.switchTo().alert().accept();

        System.out.println("Product added to cart successfully!");

        driver.quit();
    }
}
