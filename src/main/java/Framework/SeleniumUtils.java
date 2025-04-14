package Framework;

import lombok.AllArgsConstructor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

@AllArgsConstructor
public class SeleniumUtils {

WebDriver driver;
ElementUtils elementUtils;

//public SeleniumUtils(WebDriver driver)
//{
//    this.driver=driver;
//}

public void clickOnElement(WebElement element, String labelname)
{
    if (element == null)
        throw new GenericExceptions("Unable to find the element for");

    element.click();
}
    public void clickOnElement(By by, String labelname)
    {
        WebElement element=elementUtils.findElement(by);

        if (element == null)
            throw new GenericExceptions("Unable to find the element for");

        element.click();
    }

public void enterData(WebElement element,String data,String labelName)
{
    if(element==null)
         throw new GenericExceptions("Unable to find the element for "+labelName);

    element.sendKeys(data);
}

public String createNewTabAndLaunchApplication(String Url) {
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get(Url);
        return driver.getWindowHandle();
    }

    public void closeRespectiveTabOrWindow(String urlOrTitle) throws InterruptedException {
        Set<String> handles = driver.getWindowHandles();

        for (String handle : handles) {
            driver.switchTo().window(handle);

            if (driver.getCurrentUrl().contains(urlOrTitle) || driver.getTitle().contains(urlOrTitle)) {
                driver.close();
            }

            Thread.sleep(1000);
        }
    }

    public void switchToAllTheTabsAndWindows() throws InterruptedException {
        Set<String> handles=driver.getWindowHandles();
        for(String handle:handles)
        {
            driver.switchTo().window(handle);
            Thread.sleep(1000);
        }
    }
    public String launchApplication(String url)
    {
        if(url.isBlank() || url.isEmpty())
        throw new GenericExceptions("Given URL is empty or blank");

        else if (!url.contains("https"))
            throw new GenericExceptions("Given URL does not contain https:");

        else if (!url.startsWith("https"))
            throw new GenericExceptions("Given URL does not start with https:");

        driver.get(url);
        driver.manage().window().maximize();

        return driver.getWindowHandle();
    }

}