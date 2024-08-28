package step_definitions.transfer;

import hooks.Hooks;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.profil.ProfilPage;
import pages.transfer.TransferPage;

import java.io.IOException;

public class TransferStep {

    WebDriver driver;

    public TransferStep() throws IOException {
        super();
        this.driver= Hooks.driver;
    }

    @And("On Transfer page, The user input {string} as Keterangan")
    public void inputKeterangan(String Keterangan){
        TransferPage transferPage = new TransferPage(driver);
        transferPage.inputKeterangan(Keterangan);
        TransferPage.putKeterangan();
    }

    @And("On Transfer page, The user input {string} as Nominal")
    public void inputNominal(String nominal){
        TransferPage transferPage = new TransferPage(driver);
        transferPage.inputNominal(nominal);
        TransferPage.putNominal();
    }

    @And("On Transfer page, The user select {string} as Rekening Sumber")
    public void selectRekeningSumber(String rekeningSumber){
        TransferPage transferPage = new TransferPage(driver);
        transferPage.selectRekeningSumber(rekeningSumber);
    }

    @And("On Transfer page, The user verify value in preview Rekening Tujuan is correct")
    public void previewRekeningTujuanIsCorrect(){
        TransferPage transferPage = new TransferPage(driver);
        Assert.assertEquals(transferPage.getValuePreviewAccountDestination("nameAccountDestination"),"Test Mobile");
        Assert.assertEquals(transferPage.getValuePreviewAccountDestination("bankNameAccountDestination"),TransferPage.getBankTujuan());
        Assert.assertEquals(transferPage.getValuePreviewAccountDestination("numberAccountDestination"),
                TransferPage.getNumberBankTujuan());
    }

    @And("On Transfer page, The user verify Bank Tujuan is {string}")
    public void verifyBankTujuan(String bank){
        TransferPage transferPage = new TransferPage(driver);
        Assert.assertEquals(transferPage.getValueBankTujuan(),bank);
        TransferPage.putBankTujuan();
    }

    @And("On Transfer page, The user input {string} as Rekening Tujuan")
    public void inputRekeningTujuan(String rekeningTujuan){
        TransferPage transferPage = new TransferPage(driver);
        transferPage.inputRekeningTujuan(rekeningTujuan);
        TransferPage.putNumberBankTujuan();
    }

    @And("On Transfer page, The user click {string} button")
    public void clickButtonOnTransfer(String button){
        TransferPage transferPage = new TransferPage(driver);
        transferPage.clickButtonOnTransfer(button);
    }

    @And("The user will redirect to Transfer page")
    public void redirectToTransferPage(){
        TransferPage transferPage = new TransferPage(driver);
        Assert.assertTrue(transferPage.redirectToTransferPage());
    }

}
