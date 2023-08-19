package techproed.stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import techproed.pages.DataTablePage;

public class Data {
    DataTablePage dataTablePage = new DataTablePage();
    @Then("kullanici sayfadaki tabloda new butonuna tiklar")
    public void kullaniciSayfadakiTablodaNewButonunaTiklar() {
        dataTablePage.newButton.click();
    }

    @And("kullanici bilgileri girer {string},{string},{string},{string},{string},{string},{string}")
    public void kullaniciBilgileriGirer(String name, String lastName, String position, String office, String extention, String date, String salary) {
        dataTablePage.firstName.sendKeys(name, Keys.TAB,lastName,Keys.TAB,position,Keys.TAB,office,Keys.TAB,extention,Keys.TAB,date,Keys.TAB,salary);

    }

    @And("kullanici create butonuna basar")
    public void kullaniciCreateButonunaBasar() {
        dataTablePage.createButton.click();
    }

    @And("kullanici search bolumune {string} bilgisini girer")
    public void kullaniciSearchBolumuneBilgisiniGirer(String str) {
        dataTablePage.searchBox.click();
    }

    @And("kullanici {string} ile basarili bir sekilde giris yapildigini dogrular")
    public void kullaniciIleBasariliBirSekildeGirisYapildiginiDogrular(String str) {
        Assert.assertTrue(dataTablePage.searchVerify.getText().contains(str));
    }
}