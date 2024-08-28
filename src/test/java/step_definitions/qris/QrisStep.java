package step_definitions.qris;

import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.qris.QrisPage;
import pages.registrasi.RegistrasiPage;

import java.io.IOException;

public class QrisStep {

    WebDriver driver;

    public QrisStep() throws IOException {
        super();
        this.driver= Hooks.driver;
    }

    @And("The user verify qr code success generated")
    public void qrCodeSuccessGenerated(){
        QrisPage qrisPage = new QrisPage(driver);
        qrisPage.qrCodeSuccessGenerated();
    }

    @And("On Qris page, The user click Selanjutnya button")
    public void clickSelanjutnyaButton(){
        QrisPage qrisPage = new QrisPage(driver);
        qrisPage.clickSelanjutnyaButton();
    }

    @And("On Qris page, The user input {string} as pin")
    public void inputPin(String pin){
        QrisPage qrisPage = new QrisPage(driver);
        qrisPage.inputPin(pin);
    }

    @And("On Qris page, The user input {string} as nominal")
    public void inputNominal(String nominal){
        QrisPage qrisPage = new QrisPage(driver);
        qrisPage.inputNominal(nominal);
    }

    @And("On Qris page, The user select {string} account as Rekening Sumber")
    public void selectRekeningSumber(String text){
        QrisPage qrisPage = new QrisPage(driver);
        qrisPage.selectRekeningSumber(text);
    }

    @Then("The user will redirect to QRIS page")
    public void redirectToQRISPage(){
        QrisPage qrisPage = new QrisPage(driver);
        Assert.assertTrue(qrisPage.redirectToQRISPage());
    }

}
