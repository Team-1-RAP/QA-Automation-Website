package step_definitions.pengaturan;

import hooks.Hooks;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.mutasi.MutasiPage;
import pages.pengaturan.PengaturanPage;

import java.io.IOException;

public class PengaturanStep {

    WebDriver driver;

    public PengaturanStep() throws IOException {
        super();
        this.driver= Hooks.driver;
    }

    @And("The user will redirect to Pengaturan page")
    public void redirectToPengaturanPage(){
        PengaturanPage pengaturanPage = new PengaturanPage(driver);
        Assert.assertTrue(pengaturanPage.redirectToPengaturanPage());
    }

}
