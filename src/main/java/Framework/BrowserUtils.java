package Framework;

import lombok.SneakyThrows;
import lombok.experimental.UtilityClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Locale;
@UtilityClass
public class BrowserUtils {

    //Kill existing browser sessions
    @SneakyThrows
     public void killExistingBrowsers()
     {
         Runtime.getRuntime().exec("TASKKILL -f -im chromedriver.exe /T");
         Runtime.getRuntime().exec("TASKKILL -f -im geckodriver.exe /T");
         Runtime.getRuntime().exec("TASKKILL -f -im msedgedriver.exe /T");
     }

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
