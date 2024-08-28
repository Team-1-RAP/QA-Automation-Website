package pages.registrasi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class RegistrasiPage {

    WebDriver driver;

    @FindBy(id = "email")
    private WebElement emailField;

    @FindBy(id = "username")
    private WebElement usernameField;

    @FindBy(id = "password")
    private WebElement passwordField;

    @FindBy(id = "confirmPassword")
    private WebElement confirmPasswordField;

    @FindBy(id = "KodeOTP")
    private WebElement otpField;

    @FindBy(xpath = "//button[@class='py-3 bg-[#055287] rounded-lg text-white w-1/2']")
    private WebElement selanjutnyaButtonTab1;

    public RegistrasiPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);
        this.driver=driver;
    }

    public boolean redirectToTabVerifikasiEmail(){
        otpField.isDisplayed();
        return true;
    }

    public void clickButton(String button){
        WebElement buttonElement;
        switch (button){
            case "Selanjutnya":
                buttonElement = selanjutnyaButtonTab1;
            break;
            default:
            throw new IllegalArgumentException("Button " + button + " not found");
        }
        buttonElement.click();
    }

    public void inputConfirmPassword(String confirmPassword){
        confirmPasswordField.sendKeys(confirmPassword);
    }

    public void inputPassword(String password){
        passwordField.sendKeys(password);
    }

    public void inputUsername(String email){
        usernameField.sendKeys(email);
    }

    public void inputEmail(String email){
        emailField.sendKeys(email);
    }

    public boolean redirectToRegisterPage(){
        emailField.isDisplayed();
        usernameField.isDisplayed();
        passwordField.isDisplayed();
        confirmPasswordField.isDisplayed();
        return true;
    }

}
