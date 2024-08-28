package pages.landingPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class LandingPagePage {

    WebDriver driver;

    @FindBy(css = "[src='/assets/logo-CbWGJAUa.png']")
    private WebElement logoSimpleBank;

    @FindBy(css = ".mr-2")
    private WebElement registerButton;

    @FindBy(xpath = "//button[@class='px-4 py-2 text-white rounded-xl bg-[#0079CB] drop-shadow-md w-[120px] h-[40px] " +
            "md:w-[140px] md:h-[50px]']")
    private WebElement loginButton;

    public LandingPagePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);
        this.driver=driver;
    }

    public void clickButtonInLandingPage(String button){
        WebElement buttonElement;
        switch (button){
            case "Register":
                buttonElement = registerButton;
                break;
            case "Login":
                buttonElement = loginButton;
                break;
            default:
                throw new IllegalArgumentException("Button " + button + " not found");
        }
        buttonElement.click();
    }

    public String alreadyOpenSimpleBank() throws InterruptedException {
        return driver.getCurrentUrl();
    }

    public boolean onLandingPage(){
        logoSimpleBank.isDisplayed();
        registerButton.isDisplayed();
        loginButton.isDisplayed();
        return true;
    }

}
