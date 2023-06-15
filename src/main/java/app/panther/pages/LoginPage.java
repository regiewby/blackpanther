package app.panther.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.bidi.log.Log;

public class LoginPage {

    WebDriver webDriver;

    public LoginPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public LoginPage insertUserName(String userName) {
        webDriver.findElement(By.id("user-name")).sendKeys(userName);

        return this;
    }

    public LoginPage insertPassword(String password) {
        webDriver.findElement(By.id("password")).sendKeys(password);

        return this;
    }

    public LoginPage clickLogin() {
        webDriver.findElement(By.id("login-button")).click();

        return this;
    }


}
