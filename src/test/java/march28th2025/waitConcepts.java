package march28th2025;

import Framework.GenericExceptions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class waitConcepts {
    public static void main(String[] args) {

        RemoteWebDriver driver = new ChromeDriver();

        System.out.println(driver.getCapabilities());

        driver.get("https://makemytrip.com");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.findElement(By.xpath("//button[text()='ACCEPT']")).click();
        driver.findElement(By.partialLinkText("India")).click();
        driver.findElement(By.xpath("//input[@data-cy='fromCity']")).click();

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("#fromCity")));

    }
}
