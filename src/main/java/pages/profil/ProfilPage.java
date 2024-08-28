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

    @FindBy(css = ".h-7.w-7")
    private WebElement showHideInProfile;

    @FindBy(css = ".ms-6")
    private WebElement hideInProfile;

    @FindBy(xpath = "//button[@class='ms-6 cursor-pointer flex items-center']/preceding-sibling::*")
    private WebElement balanceValue;

    public ProfilPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);
        this.driver=driver;
    }

    public String getBalanceValue(){
        return balanceValue.getText();
    }

    public void clickHideInProfile(){
        hideInProfile.click();
    }

    public void clickShowHideInProfile(){
        showHideInProfile.click();
    }

    public boolean redirectToProfilPage(){
        cardSection.isDisplayed();
        gantiKartuButton.isDisplayed();
        return true;
    }



}
