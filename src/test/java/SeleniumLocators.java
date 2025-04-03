import Framework.BrowserUtils;
import Framework.SeleniumUtils;
import org.openqa.selenium.WebDriver;

public class SeleniumLocators {
    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {

        driver = BrowserUtils.GetDriver("chrome");
        driver.get("https://www.bappam.com");
        SeleniumUtils Seleniumutil=new SeleniumUtils(driver);

        Seleniumutil.createNewTabAndLaunchApplication("https://bappam.com");
        Seleniumutil.closeRespectiveTabOrWindow("bappam");

        Seleniumutil.launchApplication("");
    }
}
