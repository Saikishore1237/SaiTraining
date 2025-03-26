import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.plaf.TableHeaderUI;
import java.util.Set;

public class CloseVsQuit {

    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {

        driver = new ChromeDriver();
        String handle = launchApplication("https://www.snapchat.com");
        System.out.println(handle);
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

        createNewTabAndLaunchApplication("https://www.cricbuzz.com");
        createNewTabAndLaunchApplication("https://www.snapchat.com");
        createNewTabAndLaunchApplication("https://www.gmail.com");
        createNewTabAndLaunchApplication("https://www.facebook.com");

        createNewWindowAndLaunchApplication("https://www.cricbuzz.com");
        createNewWindowAndLaunchApplication("https://www.snapchat.com");

        switchToAllTheTabsAndWindows();

        closeBrowser("snap");
    }

    public static String launchApplication(String url)
    {
        driver.get(url);
        driver.manage().window().maximize();
        return driver.getWindowHandle();
    }

    public static String createNewTabAndLaunchApplication(String Url)
    {
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get(Url);
        return driver.getWindowHandle();
    }

    public static String createNewWindowAndLaunchApplication(String url)
    {
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get(url);
        return driver.getWindowHandle();
    }

    public static void switchToAllTheTabsAndWindows() throws InterruptedException {
        Set<String> handles = driver.getWindowHandles();

        for(String handle : handles)
        {
            driver.switchTo().window(handle);
            Thread.sleep(1000);
        }
    }

    public static String closeBrowser(String UrlorTitle)
    {
        if(driver.getCurrentUrl().contains(UrlorTitle) || driver.getTitle().contains(UrlorTitle))
            driver.close();

        return driver.getWindowHandle();
    }
}
