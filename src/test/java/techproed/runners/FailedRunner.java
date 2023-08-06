package techproed.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)//-->Scenario calistirici notasyonu. Cucumber ile junit entegrasyonunu saglar
@CucumberOptions(plugin = {"pretty",
        "html:target/default-cucumber-reports.html",
        "json:target/json-reports/cucumber.json",
        "junit:target/xml-report/cucumber.xml",
        "rerun:TestOutput/failed_scenario.txt"},
        //rerun ile belirttigimiz dosyada fail olan senaryolar tutulur.
        features = "@TestOutput/failed_scenario.txt",
        glue = {"techproed/stepDefinition"},
        dryRun = false,//-->true secersek secenariolari kontrol eder browser'i calistirmaz
        monochrome = true) //-->false olursa consoldaki ciktilar renkli olur


public class FailedRunner {
}

/*
    FailedRunner class'ini olusturma amacimiz rerun ile belirttigimiz yolda fail olan scenariolari
tekrar bu class'dan tum scenario'lari tekrar calistirmak yerine sadece fail olanlari calistirmak
icin kullaniriz. @CucumberOptions() parametresi icine belirttigimiz features tag'ina bu class'da
fail olan scenariolari tutan txt dosyasinin yolunu belirtiriz. Dosya yolu belirttigimiz icin
onune @ isareti koymamiz gerekir.
 */
