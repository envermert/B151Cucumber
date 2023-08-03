package techproed.stepDefinition;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import techproed.pages.BlueRentalPage;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

import java.util.Map;

public class BlueRentalStepDefinition {

    BlueRentalPage blueRentalPage = new BlueRentalPage();
    @Then("kullanici login buttonuna tiklar")
    public void kullaniciLoginButtonunaTiklar() {
        blueRentalPage.loginButtonu.click();
    }

    @And("kullanici tabloda verilen bilgiler ile login olur")
    public void kullaniciTablodaVerilenBilgilerIleLoginOlur(DataTable data) {
        blueRentalPage.emailBox.sendKeys(data.row(1).get(0), Keys.TAB,data.row(1).get(1),Keys.ENTER);
        ReusableMethods.bekle(3);
        Driver.getDriver().navigate().back();
        blueRentalPage.emailBox.sendKeys(data.row(2).get(0),Keys.TAB,data.row(2).get(1),Keys.ENTER);
        ReusableMethods.bekle(3);
    }

    @And("kullanici tabloda ki verilen bilgileri kullanarak map ile login olur")
    public void kullaniciTablodaKiVerilenBilgileriKullanarakMapIleLoginOlur(DataTable data) {
        for (Map<String,String> w:data.asMaps()) {
            blueRentalPage.emailBox.sendKeys(w.get("email"),Keys.TAB,w.get("password"),Keys.ENTER);
            ReusableMethods.bekle(3);
            Driver.getDriver().navigate().back();
            ReusableMethods.bekle(3);

        }
    }
}
