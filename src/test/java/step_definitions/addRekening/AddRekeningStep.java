package step_definitions.addRekening;

import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.addRekening.AddRekeningPage;
import pages.registrasi.RegistrasiPage;

import java.io.IOException;

public class AddRekeningStep {

    WebDriver driver;

    public AddRekeningStep() throws IOException {
        super();
        this.driver= Hooks.driver;
    }

    @And("The user verify redirected to Tab Formula Data Diri")
    public void redirectedToTabFormulaDataDiri(){
        AddRekeningPage addRekeningPage = new AddRekeningPage(driver);
        Assert.assertTrue(addRekeningPage.redirectedToTabFormulaDataDiri());
    }

    @And("The user click Selanjutnya button")
    public void clickSelanjutnyaButton(){
        AddRekeningPage addRekeningPage = new AddRekeningPage(driver);
        addRekeningPage.clickSelanjutnyaButton();
    }

    @And("The user select {string} in Jenis Rekening")
    public void selectJenisRekening(String jenisRekening){
        AddRekeningPage addRekeningPage = new AddRekeningPage(driver);
        addRekeningPage.selectJenisRekening(jenisRekening);
    }

    @Then("The user will redirect to Tambah Rekening page")
    public void redirectToTambahRekeningPage(){
        AddRekeningPage addRekeningPage = new AddRekeningPage(driver);
        Assert.assertTrue(addRekeningPage.redirectToTambahRekeningPage());
    }

}
