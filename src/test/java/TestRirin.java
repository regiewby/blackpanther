import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class TestRirin {

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

        //click product
        webDriver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();

        //click add to cart
        webDriver.findElement(By.id("shopping_cart_container")).click();

        //click checkout
        webDriver.findElement(By.id("checkout")).click();

        //insert data customer
        webDriver.findElement(By.id("first-name")).sendKeys("Ririn");
        webDriver.findElement(By.id("last-name")).sendKeys("Elros");
        webDriver.findElement(By.id("postal-code")).sendKeys("15145");
        webDriver.findElement(By.id("continue")).click();

        //finish
        webDriver.findElement(By.id("finish")).click();

        // close browser
        webDriver.close();

    }
}
