package pages;

import org.openqa.selenium.WebDriver;
import locators.loginLocators;
import utils.actions;

public class LoginPage implements loginLocators {

    WebDriver driver;
    actions act;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        act = new actions(driver);
    }

    public void login(String user, String pass) {
        act.enterText(username, user);
        act.enterText(password, pass);
        act.click(loginButton);
    }
}