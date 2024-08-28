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

    @FindBy(xpath = "//button[@class='bg-[#549EFF] w-[182px] h-[41px] rounded-[10px] border text-white']")
    private WebElement transferButton;

    @FindBy(xpath = "//*[contains(@placeholder,'Cari daftar transfer...')]")
    private WebElement cariDaftarTransferButton;

    @FindBy(css = "[placeholder='Masukan nomor rekening tujuan']")
    private static WebElement rekeningTujuanField;

    @FindBy(xpath = "//div[@class='flex flex-col w-[417px]']/div[1]/div[@class='relative']/child::input")
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

    @FindBy(xpath = "//div[@class='flex flex-col bg-white border border-[#549EFF] w-[390px] h-full rounded-lg p-3']/div[3]/p[@class='text-[#549EFF]']")
    private static WebElement nominalInKonfirmasiTransfer;

    @FindBy(xpath = "//p[.='0']")
    private static WebElement biayaAdminInKonfirmasiTransfer;

    @FindBy(xpath = "//div[5]/p[@class='text-[#549EFF]']")
    private static WebElement totalInKonfirmasiTransfer;

    @FindBy(xpath = "//label[.='Keterangan']/following-sibling::p")
    private static WebElement keteranganInKonfirmasiTransfer;

    @FindBy(css = "[placeholder='Masukkan PIN']")
    private static WebElement pinFIeld;

    @FindBy(xpath = "//*[contains(text(),'Transaksi Berhasil')]")
    private static WebElement transaksiBerhasilLabelInTransferSuccess;

    @FindBy(css = ".leading-6")
    private static WebElement nominalInTransferSuccess;

    public TransferPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);
        this.driver=driver;
    }

    public void inputPin(String pin){
        pinFIeld.sendKeys(pin);
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

    public String getValueTransferSuccess(String value){
        switch (value){
            case "transaksiBerhasilLabelInTransferSuccess":
                return transaksiBerhasilLabelInTransferSuccess.getText();
            case "nominalInTransferSuccess":
                return nominalInTransferSuccess.getText();
            default:
                throw new IllegalArgumentException("Value " + value + " not found");
        }
    }

    public String getValueKonfirmasiTransfer(String value){
        switch (value){
            case "nominalInKonfirmasiTransfer":
                return nominalInKonfirmasiTransfer.getText();
            case "biayaAdminInKonfirmasiTransfer":
                return biayaAdminInKonfirmasiTransfer.getText();
            case "totalInKonfirmasiTransfer":
                return totalInKonfirmasiTransfer.getText().replaceAll("(^0-9)","");
            case "keteranganInKonfirmasiTransfer":
                return keteranganInKonfirmasiTransfer.getText();
            default:
                throw new IllegalArgumentException("Value " + value + " not found");
        }
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
        value.put("bankTujuan",bankTujuanField.getAttribute("placeholder"));
    }

    public static String getBankTujuan(){
        return value.get("bankTujuan");
    }

    public static void putNumberBankTujuan(){
        value.put("numberBankTujuan",rekeningTujuanField.getAttribute("value"));
    }

    public static String getNumberBankTujuan(){
        return value.get("numberBankTujuan");
    }

    public static void putNominal(){
        value.put("nominal",nominalMasukkanField.getAttribute("value"));
    }

    public static String getNominal(){
        return value.get("nominal").replaceAll("(^0-9)","");
    }

    public static String getNominalIDR(){
        int nominalIdr = Integer.parseInt(value.get("nominal"));
        return "Rp" + String.format("%,d",nominalIdr);
    }

    public static void putKeterangan(){
        value.put("Keterangan",keteranganField.getAttribute("value"));
    }

    public static String getKeterangan(){
        return value.get("Keterangan");
    }

    public String getValueBankTujuan(){
        return bankTujuanField.getAttribute("placeholder");
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
            case "Transfer":
                buttonElement = transferButton;
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
