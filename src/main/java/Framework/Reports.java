package Framework;

import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.nio.file.Files;

@AllArgsConstructor
public class Reports {

    private static WebDriver driver;

    @SneakyThrows
    public static void captureScreenshots()
    {
    File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

    System.out.println(src.getPath());

    File dest=new File(System.getProperty("user.dir")+"//Image1.png");

        Files.copy(src.toPath(), dest.toPath());

       // return dest.getPath();
    }

}
