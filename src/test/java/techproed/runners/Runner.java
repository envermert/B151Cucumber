package techproed.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)//-->Scenario calistirici notasyonu. Cucumber ile junit entegrasyonunu saglar
@CucumberOptions(plugin = {"pretty" ,
        "html:target/default-cucumber-reports.html",
        "json:target/json-reports/cucumber.json",
        "junit:target/xml-report/cucumber.xml"} ,
        features = "src/test/resources/features" ,
        glue = {"techproed/stepDefinition"} ,
        tags = "@arac2" ,
        dryRun = false ,
        monochrome = true) //-->false olursa consoldaki ciktilar renkli olur
/*
    @CucumberOptions() notasyonuna parametere olarak
    features-->features package'inin yolunu belirtiriz(Content Root)
    glur-->stepDefinition package(source root)
    tags-->calistirmak istedigimiz scenariolari bu parametrede berlirtiriz

    @CucumberOptions() notasyonu scenariolari nerede ve nasil calisacagi , hangi raporu kullanacagi ile alakali secenekleri
    bu notasyonda belirtiriz
 */

public class Runner {

}
