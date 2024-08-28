package pages.beranda;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.HashMap;

public class BerandaPage {

    WebDriver driver;

    @FindBy(xpath = "//aside[@class='hidden lg:flex w-[209px] h-screen lg:flex-col items-center pb-4 shadow fixed z-10']//a[.='Beranda']")
    private WebElement berandaMenu;

    @FindBy(xpath = "//aside[@class='hidden lg:flex w-[209px] h-screen lg:flex-col items-center pb-4 shadow fixed z-10']//a[.='Mutasi']")
    private WebElement mutasiMenu;

    @FindBy(xpath = "//aside[@class='hidden lg:flex w-[209px] h-screen lg:flex-col items-center pb-4 shadow fixed z-10']//a[.='Profil']")
    private WebElement profileMenu;

    @FindBy(xpath = "//aside[@class='hidden lg:flex w-[209px] h-screen lg:flex-col items-center pb-4 shadow fixed z-10']//a[.='Pengaturan']")
    private WebElement pengaturanMenu;

    @FindBy(id = "QRIS-Services")
    private WebElement qrisMenu;

    @FindBy(id = "Transfer-Services")
    private WebElement transferMenu;

    @FindBy(id = "Tambah-Rekening-Services")
    private WebElement tambahRekeningMenu;

    @FindBy(id = "username")
    private WebElement searchButton;

    @FindBy(xpath = "//button[@class='flex items-center justify-center bg-[#F1F5F9] w-[36px] h-[36px] rounded-full']")
    private WebElement logoutButton;

    @FindBy(css = ".w-6")
    private WebElement showHideBalanceButton;

    @FindBy(xpath = "//div[@class='[400px]:text-2xl text-xl font-bold']")
    private static WebElement balanceValue;


    public BerandaPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);
        this.driver=driver;
    }

    static HashMap<String,String> value = new HashMap<>();

    public static void putBalanceAccount(){
        value.put("balanceAccount",balanceValue.getText());
    }

    public static String getBalanceAccount(){
        return value.get("balanceAccount");
    }

    public String getValueBalance(){
        return balanceValue.getText();
    }

    public void clickShowHideBalanceIcon(){
        showHideBalanceButton.click();
    }

    public void clickButtonInBeranda(String button){
        WebElement buttonElement;
        switch (button){
            case "Logout":
                buttonElement = logoutButton;
                break;
            case "Search":
                buttonElement = searchButton;
                break;
            default:
                throw new IllegalArgumentException("Button " + button + " not found");
        }
        buttonElement.click();
    }

    public void clickMenuInBeranda(String menu){
        WebElement menuElement;
        switch (menu){
            case "Beranda":
                menuElement = berandaMenu;
                break;
            case "Mutasi":
                menuElement = mutasiMenu;
                break;
            case "Profil":
                menuElement = profileMenu;
                break;
            case "Pengaturan":
                menuElement = pengaturanMenu;
                break;
            case "QRIS":
                menuElement = qrisMenu;
                break;
            case "Transfer":
                menuElement = transferMenu;
                break;
            case "Tambah Rekening":
                menuElement = tambahRekeningMenu;
                break;
            default:
                throw new IllegalArgumentException("Menu " + menu + " not found");
        }
        menuElement.click();
    }

    public boolean redirectToBerandaPage(){
        waitForVisibility(berandaMenu);
        berandaMenu.isDisplayed();
        mutasiMenu.isDisplayed();
        profileMenu.isDisplayed();
        pengaturanMenu.isDisplayed();
        return true;
    }

    public void waitForVisibility(WebElement e) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
        wait.until(ExpectedConditions.visibilityOf(e));
    }

}
