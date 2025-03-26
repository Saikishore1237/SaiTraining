import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class LaunchEdge {
    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.firefoxdriver().setup();

        driver = new FirefoxDriver();

        driver.get("https://Amazon.co.uk");

        WebElement but_Accept = driver.findElement(By.id("sp-cc-accept"));

        but_Accept.click();

        driver = new ChromeDriver();

        driver.get("https://www.facebook.com");
//        WebElement but_Accept1 = driver.findElement(By.id("facebook"));
//        but_Accept1.click();


        // driver = new EdgeDriver();
        driver = WebDriverManager.edgedriver().create();
        driver.wait(3000);
        driver.get("https://www.google.com");

    }
}
