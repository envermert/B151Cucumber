package techproed.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

/*
Runner class'i testNG 'deki .xml file kullanimindaki gibi istedigimiz scenario'lari kullanacagimiz tag parametresi
sayesinde cailstirabiliriz. Ve plugin parametresi ile raporlar alabiliriz.
 */
@RunWith(Cucumber.class)//--> Test calistirici Notasyon
@CucumberOptions(plugin = {"pretty","html:target/default-cucumber-reports.html",
                           "json:target/json-reports/cucumber.json",
                           "junit:target/xml-report/cucumber.xml"},
                features = "src/test/resources/features",
                glue = {"techproed/stepDefinition"},
                tags = "@g",
                dryRun = false,//-->true secersek scenariolari kontrol eder borwser'i calistirmaz
                monochrome = false//--> false olursa consoldaki ciktilar renkli olur. true -->dersek ciktilar tek renk (siyah) olur
)


public class Runner {

}

/*
@CucumberOptions() notasyonuna parametre olarak
    features--> packege'in yolunu belirtiriz (Content Root)
    glue-->stepdefinition package (source root)
    tags-->calistirmak istedigimiz scenariolari bu parametrede belirtiriz.
@CucumberOptions() notasyonu scenariolarin nerede ve nasil calisacagi, hangi raporu kullanacagi ile alakali secenekleri
bu notasyonda belirtiriz.

@CucumberOptions() notasyonu icerisine plugin parametresi ile yukaridaki gibi almak istedigimiz
rapor cesidini secip ekliyoruz.
pretty--> Consol'da calistirdigimiz scenario ile ilgili ayrintili bilgi verir.

 */