package step_definitions.mutasi;

import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.login.LoginPage;
import pages.mutasi.MutasiPage;

import java.io.IOException;

public class MutasiStep {

    WebDriver driver;

    public MutasiStep() throws IOException {
        super();
        this.driver= Hooks.driver;
    }

    @And("On Mutasi page, The user select 25")
    public void select25(){
        MutasiPage mutasiPage = new MutasiPage(driver);
        mutasiPage.select25ShowData();
    }

    @And("On Mutasi page, The user select Pengeluaran")
    public void selectPengeluaran(){
        MutasiPage mutasiPage = new MutasiPage(driver);
        mutasiPage.selectPengeluaran();
    }

    @And("The user verify filter applied")
    public void filterApplied() throws InterruptedException {
        MutasiPage mutasiPage = new MutasiPage(driver);
        Assert.assertTrue(mutasiPage.filterApplied());
    }

    @And("On Mutasi page, The user select July")
    public void selectJuly(){
        MutasiPage mutasiPage = new MutasiPage(driver);
        mutasiPage.selectJuly();
    }

    @And("On Mutasi page, The user click filter by {string}")
    public void clickFilterInMutasi(String filter){
        MutasiPage mutasiPage = new MutasiPage(driver);
        mutasiPage.clickFilterInMutasi(filter);
    }

    @And("The user will redirect to Mutasi page")
    public void redirectToMutasiPage(){
        MutasiPage mutasiPage = new MutasiPage(driver);
        Assert.assertTrue(mutasiPage.redirectToMutasiPage());
    }

}
