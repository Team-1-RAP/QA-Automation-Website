package pages.transfer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import java.util.HashMap;

public class TransferPage {

    WebDriver driver;

    @FindBy(css = ".text-white")
    private WebElement transferBaruButton;

    @FindBy(css = ".text-white")
    private WebElement selanjutnyaButton;

    @FindBy(xpath = "//button[@class='bg-[#549EFF] w-[182px] h-[41px] rounded-[10px] border text-white']")
    private WebElement lanjutkanButton;

    @FindBy(xpath = "//*[contains(@placeholder,'Cari daftar transfer...')]")
    private WebElement cariDaftarTransferButton;

    @FindBy(css = "[placeholder='Masukan nomor rekening tujuan']")
    private static WebElement rekeningTujuanField;

    @FindBy(css = "[placeholder='BCA']")
    private static WebElement bankTujuanField;

    @FindBy(css = "select")
    private static WebElement rekeningSumberField;

    @FindBy(xpath = "//div[@class='flex flex-col gap-1']/child::h1")
    private static WebElement nameAccountDestinationValue;

    @FindBy(xpath = "//div[@class='flex flex-col gap-1']/child::p")
    private static WebElement detailAccountDestinationValue;

    @FindBy(xpath = "//option[.='Pilih Rekening Sumber']/following-sibling::option")
    private static WebElement rekeningSumber1;

    @FindBy(css = "[placeholder='Masukkan Nominal']")
    private static WebElement nominalMasukkanField;

    @FindBy(css = "[placeholder='Keterangan Transfer']")
    private static WebElement keteranganField;

    public TransferPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);
        this.driver=driver;
    }

    public void inputKeterangan(String keterangan){
        keteranganField.sendKeys(keterangan);
    }

    public void inputNominal(String nominal){
        nominalMasukkanField.sendKeys(nominal);
    }

    public void selectRekeningSumber(String rekeningSumber){
        rekeningSumberField.click();
        WebElement rekeningSumberElement;
        switch (rekeningSumber){
            case "0120000027":
                rekeningSumberElement = rekeningSumber1;
                break;
            default:
                throw new IllegalArgumentException("Rekening sumber " + rekeningSumber + " not found");
        }
        rekeningSumberElement.click();
    }

    public String getValuePreviewAccountDestination(String value){
        switch (value){
            case "nameAccountDestination":
                return nameAccountDestinationValue.getText();
            case "bankNameAccountDestination":
                return detailAccountDestinationValue.getText().split(" - ")[0];
            case "numberAccountDestination":
                return detailAccountDestinationValue.getText().split(" - ")[1];
            default:
                throw new IllegalArgumentException("Value " + value + " not found");
        }
    }

    static HashMap<String,String> value = new HashMap<>();

    public static void putBankTujuan(){
        value.put("bankTujuan",bankTujuanField.getText());
    }

    public static String getBankTujuan(){
        return value.get("bankTujuan");
    }

    public static void putNumberBankTujuan(){
        value.put("numberBankTujuan",rekeningTujuanField.getText());
    }

    public static String getNumberBankTujuan(){
        return value.get("numberBankTujuan");
    }

    public static void putNominal(){
        value.put("nominal",nominalMasukkanField.getText());
    }

    public static String getNominal(){
        return value.get("nominal");
    }

    public static void putKeterangan(){
        value.put("Keterangan",keteranganField.getText());
    }

    public static String getKeterangan(){
        return value.get("Keterangan");
    }

    public String getValueBankTujuan(){
        return bankTujuanField.getText();
    }

    public void inputRekeningTujuan(String rekeningTujuan){
        rekeningTujuanField.sendKeys(rekeningTujuan);
    }

    public void clickButtonOnTransfer(String button){
        WebElement buttonElement;
        switch (button){
            case "Transfer Baru":
                buttonElement = transferBaruButton;
                break;
            case "Selanjutnya":
                buttonElement = selanjutnyaButton;
                break;
            case "Lanjutkan":
                buttonElement = lanjutkanButton;
                break;
            default:
                throw new IllegalArgumentException("Button " + button + " not found");
        }
        buttonElement.click();
    }

    public boolean redirectToTransferPage(){
        transferBaruButton.isDisplayed();
        cariDaftarTransferButton.isDisplayed();
        return true;
    }



}
