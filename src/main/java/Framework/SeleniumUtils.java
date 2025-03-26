package Framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumUtils {

static WebDriver driver = new ChromeDriver();

    public static String createNewTabAndLaunchApplication(String Url) {
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get(Url);
        return driver.getWindowHandle();
    }
}