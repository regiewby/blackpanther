package app.panther.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LeftBarPage {

    WebDriver webDriver;

    public LeftBarPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public LeftBarPage clickButtonBurger() {
        webDriver.findElement(By.id("react-burger-menu-btn")).click();

        return this;
    }

    public LeftBarPage clickLogout() {
        webDriver.findElement(By.id("logout_sidebar_link")).click();

        return this;
    }

}
