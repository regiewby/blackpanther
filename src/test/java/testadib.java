import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class testadib {
}

    public static void main(String[] args) throws MalformedURLException {

        WebDriver webDriver = new ChromeDriver();

        // used for setup screen browser
        webDriver.manage().window().fullscreen();

        // used for navigate to web url
        webDriver.navigate().to(new URL("https://www.saucedemo.com/"));

        // insert value
        webDriver.findElement(By.id("user-name")).sendKeys("problem_user");

        // insert value
        webDriver.findElement(By.id("password")).sendKeys("secret_sauce");

        // click element
        webDriver.findElement(By.id("login-button")).click();


            webDriver.findElement(By.ByName("Products")).sendKeys("sauslabsbakcpack");

            // click element
            webDriver.findElement()By.id("addtocart-button")) .click;









        }

    }
    }

}