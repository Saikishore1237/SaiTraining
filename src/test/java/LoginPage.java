import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https:www.gmail.com");

        WebElement txt_username = driver.findElement(By.id("identifierId"));
        txt_username.sendKeys("saikishoresri@gmail.com");

        WebElement next_button = driver.findElement(By.className("VfPpkd-vQzf8d"));
        next_button.click();


    }
}
