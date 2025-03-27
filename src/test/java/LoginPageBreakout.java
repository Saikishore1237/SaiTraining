import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageBreakout {
    public static void main(String[] args) throws InterruptedException {

        //Launch page method call with URL as argument
        LoginBreakout.LaunchTestURL("https://www.tutorialspoint.com/selenium/practice/login.php");

        //Register page call
        LoginBreakout.RegisterPage("Gautham","Gambhir","GauthamGambhir007@gmail.com","Password123");

        //Login with username and password
        LoginBreakout.LoginWithUserPassword("GauthamGambhir007@gmail.com","Password123");


        //driver.get("https://www.tutorialspoint.com/selenium/practice/login.php");

//        WebElement register = driver.findElement(By.linkText("Register"));
//        register.click();
//
//        WebElement txt_firstname = driver.findElement(By.id("firstname"));
//        txt_firstname.sendKeys("Gautham");
//
//        WebElement txt_lastname = driver.findElement(By.id("lastname"));
//        txt_lastname.sendKeys("Gambhir");
//
//        WebElement txt_username = driver.findElement(By.id("username"));
//        txt_username.sendKeys("GauthamGambhir007@gmail.com");
//
//        WebElement txt_password = driver.findElement(By.id("password"));
//        txt_password.sendKeys("Password123");
//
//        WebElement button_Register = driver.findElement(By.cssSelector("input[value='Register']"));
//        button_Register.click();

//        WebElement button_BacktoLogin = driver.findElement(By.cssSelector("a[type='submit']"));
//        button_BacktoLogin.click();

//        WebElement txt_email = driver.findElement(By.id("email"));
//        txt_email.sendKeys("GauthamGambhir007@gmail.com");
//
//        WebElement txt_passwordLogin = driver.findElement(By.id("password"));
//        txt_passwordLogin.sendKeys("Password123");
//
//        WebElement button_login = driver.findElement(By.cssSelector("input[value='Login']"));
//        button_login.click();
    }
}
