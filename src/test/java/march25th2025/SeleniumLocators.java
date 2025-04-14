package march25th2025;

import Framework.BrowserUtils;
import Framework.ElementUtils;
import Framework.SeleniumUtils;
import org.openqa.selenium.WebDriver;

public class SeleniumLocators {
    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {

        driver = BrowserUtils.GetDriver("chrome");
        driver.get("https://www.bappam.com");

        ElementUtils elementUtils=new ElementUtils(driver);

        SeleniumUtils seleniumUtils = new SeleniumUtils(driver,elementUtils);

        seleniumUtils.createNewTabAndLaunchApplication("https://bappam.com");
        seleniumUtils.closeRespectiveTabOrWindow("bappam");

        seleniumUtils.launchApplication("");
    }
}
