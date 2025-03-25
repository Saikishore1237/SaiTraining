import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//src//test//resources//Drivers//chromedriver.exe");

        WebDriver driver = new ChromeDriver();

       // WebDriver driver = new FirefoxDriver();

        driver.get("http://www.google.com");


    }
}
