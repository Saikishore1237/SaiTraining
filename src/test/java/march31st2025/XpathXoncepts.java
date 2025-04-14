package march31st2025;

import Framework.BrowserUtils;
import Framework.constants.BrowserTypes;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class XpathXoncepts {

    public static void main(String[] args) {

        WebDriver driver= BrowserUtils.GetDriver(BrowserTypes.CHROME.getBrowser());

        driver.get("https://demo.automationtesting.in/Register.html");

        driver.findElement(By.xpath("//p[@class='fc-button-label' and text()='Consent']")).click();

        WebElement txt_addr=driver.findElement(By.xpath("//textarea[@ng-model='Adress']"));
        txt_addr.sendKeys("Apartment 8, " + "\n" +
                "HX12TS" + "\n" +
                "Halifax" +
                "UK");

    }
}
