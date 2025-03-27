package Framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Locale;

public class BrowserUtils {

    public static WebDriver GetDriver(String browserName)
    {
        return switch (browserName.toUpperCase())
        {
            case "CHROME" -> new ChromeDriver();
            case "FIREFOX" -> new FirefoxDriver();
            case "EDGE" -> new EdgeDriver();

            default -> throw new RuntimeException("Given browser: "+browserName+" is not found");
        };
    }
}
