import Framework.BrowserUtils;
import Framework.SeleniumUtils;
import org.openqa.selenium.WebDriver;

public class SeleniumLocators {
    static WebDriver driver;
    public static void main(String[] args) {

        driver = BrowserUtils.GetDriver("chrome");
        driver.get("https://www.bappam.com");

        SeleniumUtils.createNewTabAndLaunchApplication("https://bappam.com");
    }
}
