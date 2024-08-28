package pages.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

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

    @FindBy(xpath = "//b[.='Daftar']")
    private WebElement daftarLink;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);
        this.driver=driver;
    }

    public void clickDaftar(){
        daftarLink.click();
    }

    public void clickLupaPassword(){
        forgotYourPasswordLink.click();
    }

    public void clickLoginButton(){
        loginButton.click();
    }

    public void inputPassword(String password){
        passwordField.sendKeys(password);
    }

    public void inputUsername(String username){
        usernameField.sendKeys(username);
    }

    public boolean redirectToLoginPage(){
        usernameField.isDisplayed();
        passwordField.isDisplayed();
        loginButton.isDisplayed();
        return true;
    }


}
