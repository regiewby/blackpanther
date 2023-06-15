import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class TestLogin {
    private WebDriver webDriver;
    @Before
    public void setupDriver() {
        webDriver = new ChromeDriver();
        webDriver.get("https://www.saucedemo.com/");
        webDriver.manage().window().fullscreen();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }
    @After
    public void tearDown() {
        webDriver.close();
        webDriver.quit();
    }
}
