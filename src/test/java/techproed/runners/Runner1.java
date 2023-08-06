package techproed.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)//-->Scenario calistirici notasyonu. Cucumber ile junit entegrasyonunu saglar
@CucumberOptions(plugin = {"pretty",
        "html:target/default-cucumber-reports.html",
        "json:target/json-reports/cucumber2.json",
        "junit:target/xml-report/cucumber.xml",
        "rerun:TestOutput/failed_scenario.txt"},
        //rerun ile belirttigimiz dosyada fail olan senaryolar tutulur.
        features = "src/test/resources/features",
        glue = {"techproed/stepDefinition"},
        tags = "@negatif",
        dryRun = false,//-->true secersek secenariolari kontrol eder browser'i calistirmaz
        monochrome = true) //-->false olursa consoldaki ciktilar renkli olur

public class Runner1 {
}
