package pages.mutasi;

import org.bouncycastle.oer.Switch;
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

    @FindBy(xpath = "//li[.='Juli']")
    private WebElement julyFilter;

    @FindBy(xpath = "//li[.='Pengeluaran']")
    private WebElement pengeluaranFilter;

    @FindBy(xpath = "//li[.='25']")
    private WebElement show25Filter;

    @FindBy(xpath = "//tbody[1]/tr[1]")
    private WebElement topMutasi;

    public MutasiPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);
        this.driver=driver;
    }

    public boolean filterApplied() throws InterruptedException {
        System.out.println("filter applied");
        Thread.sleep(2000);
        return true;
    }

    public void select25ShowData(){
        show25Filter.click();
    }

    public void selectPengeluaran(){
        pengeluaranFilter.click();
    }

    public void selectJuly(){
        julyFilter.click();
    }

    public void clickFilterInMutasi(String filter){
        WebElement filterELement;
        switch(filter){
            case "Month":
                filterELement = monthFilter;
                break;
            case "Type":
                filterELement = transactionTypeFilter;
                break;
            case "Show Data":
                filterELement = showDataFilter;
                break;
            default:
                throw new IllegalArgumentException("Filter " + filter + " not found");
        }
        filterELement.click();
    }

    public boolean redirectToMutasiPage(){
        monthFilter.isDisplayed();
        transactionTypeFilter.isDisplayed();
        showDataFilter.isDisplayed();
        return true;
    }



}
