import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
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

        // insert value
        webDriver.findElement(By.id("user-name")).sendKeys("standard_user");

        // insert value
        webDriver.findElement(By.id("password")).sendKeys("secret_sauce");

        // click element
        webDriver.findElement(By.id("login-button")).click();

        // close browser
        webDriver.close();
    }
}
