package pages.qris;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class QrisPage {

    WebDriver driver;

    @FindBy(id = "sourceAccountNumber")
    private WebElement accountNumberField;

    @FindBy(id = "nominal")
    private WebElement nominalField;

    @FindBy(id = "pin")
    private WebElement pinField;

    @FindBy(xpath = "//option[.='0120000027 - GOLD']")
    private WebElement goldAccount;

    @FindBy(css = ".text-white")
    private WebElement selanjutnyaButton;

    @FindBy(css = ".p-14")
    private WebElement qrCode;

    @FindBy(css = ".text-primary")
    private WebElement timeExpiredQrCode;

    public QrisPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);
        this.driver=driver;
    }

    public boolean qrCodeSuccessGenerated(){
        qrCode.isDisplayed();
        timeExpiredQrCode.isDisplayed();
        return true;
    }

    public void clickSelanjutnyaButton(){
        selanjutnyaButton.click();
    }

    public void inputPin(String pin){
        pinField.sendKeys(pin);
    }

    public void inputNominal(String nominal){
        nominalField.sendKeys(nominal);
    }

    public void selectRekeningSumber(String text){
        accountNumberField.click();
        WebElement accountElement;
        switch (text){
            case "Gold":
                accountElement = goldAccount;
                break;
            default:
                throw new IllegalArgumentException("Account " + text + " not found");
        }
        accountElement.click();
    }

    public boolean redirectToQRISPage(){
        accountNumberField.isDisplayed();
        nominalField.isDisplayed();
        pinField.isDisplayed();
        return true;
    }

}
