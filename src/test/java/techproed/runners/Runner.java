package techproed.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

/*
Runner class'i testNG 'deki .xml file kullanimindaki gibi istedigimiz scenario'lari kullanacagimiz tag parametresi
sayesinde cailstirabiliriz. Ve plugin parametresi ile raporlar alabiliriz.
 */
@RunWith(Cucumber.class)//--> Test calistirici Notasyon
@CucumberOptions(features = "src/test/resources/features",
        glue = {"techproed/stepDefinition"},
        tags = "@enver",
        dryRun = false//-->true secersek scenariolari kontrol eder borwser'i calistirmaz
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

 */