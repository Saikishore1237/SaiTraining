package march26th2025;

import Framework.BrowserUtils;
import Framework.PathUtils;
import Framework.Reports;
import Framework.SeleniumUtils;
import Framework.constants.BrowserTypes;
import lombok.SneakyThrows;
import org.openqa.selenium.*;

import java.io.File;
import java.nio.file.Files;

public class LinkTextLocator {

    static WebDriver driver;
    @SneakyThrows
    public static void main(String[] args) {

        driver = BrowserUtils.GetDriver(BrowserTypes.CHROME.getBrowser());

        SeleniumUtils seleniumUtils=new SeleniumUtils(driver);

        seleniumUtils.launchApplication("https://www.cricbuzz.com");

        WebElement link_text = driver.findElement(By.linkText("Teams"));
        seleniumUtils.clickOnElement(link_text, "Teams");

        PathUtils.applySleep(500);

        WebElement Link_Aus = driver.findElement(By.linkText("Australia"));
        seleniumUtils.clickOnElement(Link_Aus, "Australia");

//        File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//        System.out.println(src.getPath());
//
//        File dest=new File(System.getProperty("user.dir")+"//Image.png");
//
//        Files.copy(src.toPath(), dest.toPath());
        Reports.captureScreenshots();

    }
}
