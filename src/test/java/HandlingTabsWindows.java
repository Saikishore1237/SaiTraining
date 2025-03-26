import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class HandlingTabsWindows {
    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = new ChromeDriver();

        driver.get("https://www.cricbuzz.com");

       // driver.close();

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.amazon.co.uk");

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.instagram.com");
        String instahandle = driver.getWindowHandle();

        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.snapchat.com");
        String snapchathandle = driver.getWindowHandle();


        driver.switchTo().window(snapchathandle);
        driver.switchTo().window(instahandle);

        Set<String> handles = driver.getWindowHandles();

        for (String handle : handles)
        {
            driver.switchTo().window(handle);
            Thread.sleep(2000);

            System.out.println(driver.getCurrentUrl());
            System.out.println(driver.getTitle());
        }
    }
}
