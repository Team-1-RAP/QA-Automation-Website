package pages.addRekening;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class AddRekeningPage {

    WebDriver driver;

    @FindBy(xpath = "//div[@class='flex flex-col w-full space-y-6']/div[.='BRONZERekening pemula dengan layanan dasar dan biaya rendah']")
    private WebElement bronzeField;

    @FindBy(xpath = "//input[@value='1']")
    private WebElement bronzeRadioButton;

    @FindBy(xpath = "//div[@class='flex flex-col w-full space-y-6']/div[.='GOLDRekening dengan fitur tambahan dan layanan prioritas']")
    private WebElement goldField;

    @FindBy(xpath = "//div[@class='flex flex-col w-full space-y-6']/div[.='PLATINUMRekening premium dengan layanan eksklusif']")
    private WebElement platinumField;

    @FindBy(css = ".py-3")
    private WebElement selanjutnyaButton;

    @FindBy(id = "nama")
    private WebElement fullNameField;

    public AddRekeningPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);
        this.driver=driver;
    }

    public boolean redirectedToTabFormulaDataDiri(){
        fullNameField.isDisplayed();
        return true;
    }

    public void clickSelanjutnyaButton(){
        selanjutnyaButton.click();
    }

    public void selectJenisRekening(String jenisRekening){
        WebElement jenisRekeningElement;
        switch (jenisRekening){
            case "Bronze":
                jenisRekeningElement = bronzeRadioButton;
                break;
            case "Gold":
                jenisRekeningElement = goldField;
                break;
            case "Platinum":
                jenisRekeningElement = platinumField;
                break;
            default:
                throw new IllegalArgumentException("Jenis rekening " + jenisRekening + " not found");
        }
        jenisRekeningElement.click();
    }

    public boolean redirectToTambahRekeningPage(){
        bronzeField.isDisplayed();
        goldField.isDisplayed();
        platinumField.isDisplayed();
        return true;
    }

}
