package pages.forgotPassword;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class ForgotPasswordPage {

    WebDriver driver;

    @FindBy(id = "cardNumber")
    private WebElement cardNumberField;

    @FindBy(id = "cardExpMonth")
    private WebElement cardExpMonthField;

    @FindBy(id = "cardExpYear")
    private WebElement cardExpYearField;

    public ForgotPasswordPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);
        this.driver=driver;
    }

    public boolean redirectToLupaPasswordPage(){
        cardNumberField.isDisplayed();
        cardExpMonthField.isDisplayed();
        cardExpYearField.isDisplayed();
        return true;
    }


}
