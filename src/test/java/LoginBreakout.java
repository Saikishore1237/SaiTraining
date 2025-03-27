import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginBreakout {

   static WebDriver driver;

    public static String LaunchTestURL(String url)
    {
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        return driver.getWindowHandle();
    }

    public static void RegisterPage(String fname, String lname, String Username, String Password) throws InterruptedException {
        WebElement register = driver.findElement(By.linkText("Register"));
        register.click();

        WebElement txt_firstname = driver.findElement(By.id("firstname"));
        txt_firstname.sendKeys(fname);

        WebElement txt_lastname = driver.findElement(By.id("lastname"));
        txt_lastname.sendKeys(lname);

        WebElement txt_username = driver.findElement(By.id("username"));
        txt_username.sendKeys(Username);

        WebElement txt_password = driver.findElement(By.id("password"));
        txt_password.sendKeys(Password);

        WebElement button_Register = driver.findElement(By.cssSelector("input[value='Register']"));
        button_Register.click();

        Thread.sleep(3000);

        WebElement button_BacktoLogin = driver.findElement(By.cssSelector("a[type='submit']"));
        button_BacktoLogin.click();
    }

    public static void LoginWithUserPassword(String username, String password)
    {
        WebElement txt_email = driver.findElement(By.id("email"));
        txt_email.sendKeys(username);

        WebElement txt_passwordLogin = driver.findElement(By.id("password"));
        txt_passwordLogin.sendKeys(password);

        WebElement button_login = driver.findElement(By.cssSelector("input[value='Login']"));
        button_login.click();
    }
}
