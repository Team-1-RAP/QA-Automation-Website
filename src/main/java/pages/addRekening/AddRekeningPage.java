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

    @FindBy(xpath = "//div[@class='flex flex-col w-full space-y-6']/div[.='GOLDRekening dengan fitur tambahan dan layanan prioritas']")
    private WebElement goldField;

    @FindBy(xpath = "//div[@class='flex flex-col w-full space-y-6']/div[.='PLATINUMRekening premium dengan layanan eksklusif']")
    private WebElement platinumField;

    public AddRekeningPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);
        this.driver=driver;
    }

    public boolean redirectToTambahRekeningPage(){
        bronzeField.isDisplayed();
        goldField.isDisplayed();
        platinumField.isDisplayed();
        return true;
    }

}
