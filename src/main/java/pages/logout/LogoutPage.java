package pages.logout;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class LogoutPage {

    WebDriver driver;

    @FindBy(id = "month-dropdown")
    private WebElement monthFilter;

    public LogoutPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);
        this.driver=driver;
    }

    public boolean redirectToMutasiPage(){
        monthFilter.isDisplayed();
        return true;
    }



}
