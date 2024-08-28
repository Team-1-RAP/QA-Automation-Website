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

    @And("On Pengaturan page, The user click Ubah Pin option")
    public void clickUbahPin(){
        PengaturanPage pengaturanPage = new PengaturanPage(driver);
        pengaturanPage.clickUbahPin();
    }

    @And("On Pengaturan page, The user click Ubah Password option")
    public void clickUbahPassword(){
        PengaturanPage pengaturanPage = new PengaturanPage(driver);
        pengaturanPage.clickUbahPassword();
    }

    @And("The user redirected to Ubah Pin page")
    public void redirectToUbahPinPage(){
        PengaturanPage pengaturanPage = new PengaturanPage(driver);
        Assert.assertTrue(pengaturanPage.redirectToUbahPinPage());
    }

    @And("The user redirected to Ubah Password page")
    public void redirectToUbahPasswordPage(){
        PengaturanPage pengaturanPage = new PengaturanPage(driver);
        Assert.assertTrue(pengaturanPage.redirectToUbahPasswordPage());
    }

    @And("The user will redirect to Pengaturan page")
    public void redirectToPengaturanPage(){
        PengaturanPage pengaturanPage = new PengaturanPage(driver);
        Assert.assertTrue(pengaturanPage.redirectToPengaturanPage());
    }

}
