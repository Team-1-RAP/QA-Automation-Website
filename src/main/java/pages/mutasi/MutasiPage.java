package pages.mutasi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class MutasiPage {

    WebDriver driver;

    @FindBy(id = "month-dropdown")
    private WebElement monthFilter;

    @FindBy(id = "transaction-type-dropdown")
    private WebElement transactionTypeFilter;

    @FindBy(id = "show-data-dropdown")
    private WebElement showDataFilter;

    public MutasiPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);
        this.driver=driver;
    }

    public boolean redirectToMutasiPage(){
        monthFilter.isDisplayed();
        transactionTypeFilter.isDisplayed();
        showDataFilter.isDisplayed();
        return true;
    }



}
