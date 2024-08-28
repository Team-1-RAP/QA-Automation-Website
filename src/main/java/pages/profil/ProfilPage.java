package pages.profil;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class ProfilPage {

    WebDriver driver;

    @FindBy(css = ".rounded-lg")
    private WebElement cardSection;

    @FindBy(xpath = "//button[@class='text-[#838383] text-base']")
    private WebElement gantiKartuButton;

    public ProfilPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);
        this.driver=driver;
    }

    public boolean redirectToProfilPage(){
        cardSection.isDisplayed();
        gantiKartuButton.isDisplayed();
        return true;
    }



}
