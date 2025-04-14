package march28th2025;

import Framework.BrowserUtils;
import Framework.constants.BrowserTypes;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

public class FluentWaitConcepts {
    public static void main(String[] args) {

        WebDriver driver = BrowserUtils.GetDriver(BrowserTypes.CHROME.getBrowser());

        FluentWait<WebDriver> fluentWait=new FluentWait<>(driver);

        fluentWait.withTimeout(Duration.ofSeconds(20))
                .pollingEvery(Duration.ofSeconds(3))
                .ignoring(NoSuchElementException.class)
                .ignoring(StaleElementReferenceException.class)
                .withMessage("Element is not found");
        fluentWait.until(ExpectedConditions.presenceOfElementLocated(By.id("123")));
    }
}
