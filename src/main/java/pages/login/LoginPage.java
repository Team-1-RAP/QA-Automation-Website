package pages.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    WebDriver driver;

    @FindBy(id = "username")
    private WebElement usernameField;

    @FindBy(id = "password")
    private WebElement passwordField;

    @FindBy(css = ".text-base")
    private WebElement loginButton;

    @FindBy(xpath = "//b[.='password?']")
    private WebElement forgotYourPasswordLink;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public boolean redirectToLoginPage(){
        usernameField.isDisplayed();
        passwordField.isDisplayed();
        loginButton.isDisplayed();
        return true;
    }


}
