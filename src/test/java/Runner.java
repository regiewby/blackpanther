import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class Runner {


    public static void main(String[] args) throws MalformedURLException {

        // used for open chrome driver
        WebDriver webDriver = new ChromeDriver();

        // used for setup screen browser
        webDriver.manage().window().fullscreen();

        // used for navigate to web url
        webDriver.navigate().to(new URL("https://www.saucedemo.com/"));

        webDriver.findElement(By.id("user-name")).sendKeys("standard_user");
        webDriver.findElement(By.id("password")).sendKeys("secret_sauce");
        webDriver.findElement(By.id("login-button")).click();

        webDriver.close();
    }
}
