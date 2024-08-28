package pages.pengaturan;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class PengaturanPage {

    WebDriver driver;

    @FindBy(css = ".text-blue-400")
    private WebElement keamananSection;

    @FindBy(xpath = "//div[@class='h-full text-[#838383]']")
    private WebElement pusatBantuanSection;

    @FindBy(xpath = "//button[.='Ubah Password']")
    private WebElement ubahPasswordButton;

    @FindBy(xpath = "//button[.='Ubah Pin']")
    private WebElement ubahPinButton;

    @FindBy(id = "password")
    private WebElement passwordField;

    @FindBy(id = "cardNumber")
    private WebElement cardNumberField;

    public PengaturanPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);
        this.driver=driver;
    }

    public void clickUbahPin(){
        ubahPinButton.click();
    }

    public void clickUbahPassword(){
        ubahPasswordButton.click();
    }

    public boolean redirectToUbahPinPage(){
        cardNumberField.isDisplayed();
        return true;
    }

    public boolean redirectToUbahPasswordPage(){
        passwordField.isDisplayed();
        return true;
    }

    public boolean redirectToPengaturanPage(){
        keamananSection.isDisplayed();
        pusatBantuanSection.isDisplayed();
        ubahPasswordButton.isDisplayed();
        ubahPinButton.isDisplayed();
        return true;
    }



}
