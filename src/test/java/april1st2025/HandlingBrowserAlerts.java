package april1st2025;

import Framework.BrowserUtils;
import Framework.ElementUtils;
import Framework.SeleniumUtils;
import Framework.constants.BrowserTypes;
import lombok.SneakyThrows;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HandlingBrowserAlerts {
    @SneakyThrows
    public static void main(String[] args) {

        WebDriver driver = BrowserUtils.GetDriver(BrowserTypes.CHROME.getBrowser());

        ElementUtils elementUtils=new ElementUtils(driver);

        SeleniumUtils seleniumUtils = new SeleniumUtils(driver,elementUtils);
        seleniumUtils.launchApplication("https://www.tutorialspoint.com/selenium/practice/alerts.php");

        By btn_ShowAlert=By.cssSelector("button[onclick='showAlert()']");
        WebElement element=elementUtils.findElement(btn_ShowAlert);
        seleniumUtils.clickOnElement(element,"Show alert pop up");

        Thread.sleep(2000);
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();

        //seleniumUtils.clickOnElement(driver.findElement(By.cssSelector("button[onclick='myDesk()']")), "Show Confirm Pop Up");

        seleniumUtils.clickOnElement(By.cssSelector("button[onclick='myDesk()']"), "Show Confirm Pop Up");
        Thread.sleep(2000);
        driver.switchTo().alert().dismiss();

    }
}
