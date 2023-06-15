
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class TestSarah {

    public static void main(String[] args) throws MalformedURLException {

        WebDriver webDriver = new ChromeDriver();

        webDriver.manage().window().fullscreen();

        webDriver.navigate().to(new URL("https://www.saucedemo.com/"));

        webDriver.findElement(By.id("user-name")).sendKeys("standard_user");

        webDriver.findElement(By.id("password")).sendKeys("secret_sauce");

        webDriver.findElement(By.id("login-button")).click();

        webDriver.findElement(By.id("shopping_cart_container")).click();

        webDriver.findElement(By.id("checkout")).click();

        webDriver.findElement(By.id("first-name")).sendKeys("Peter");

        webDriver.findElement(By.id("last-name")).sendKeys("Parker");

        webDriver.findElement(By.id("postal-code")).sendKeys("1234");

        webDriver.findElement(By.id("continue")).click();

        webDriver.findElement(By.id("finish")).click();

        webDriver.findElement(By.id("back-to-products")).click();

        webDriver.findElement(By.id("react-burger-menu-btn")).click();

        webDriver.findElement(By.id("logout_sidebar_link")).click();

        webDriver.close();
           }
}
