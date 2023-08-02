@hepsi
Feature: US003 TechProEducation Sayfasi Testi

  #Feature file icinde Scenario'larda ortak kullanilan step'lerde Background: yapisini kullanabiliriz.
  #Her scenario'dan once buradaki step calisir sonra scenario'daki stepler calismaya devam eder.
  Background: Kullanici TechproEducation Sayfasina Gider
    Given kullanici techpro sayfasina gider

  Scenario: TC01 Sayfada Arama Yapar
    Then arama kutusunda qa aratir
    And sayfa basliginin qa icerdigini test eder

    #Feature: filde da daha once olusturdugumuz bir method'u baska scenario larda tekrar olusturmadan kullanabiliriz.
  #Yukaridaki ornekte sayfayi kapatir step'i icin daha once amazonStepDefinition class'inda olusturdugumuz methodu
  #kullanabiliriz.

  ## Featurelarin istedigimiz siraya gore veya alfabetik olarak calismasini istiyorsak file larin basina a b c vs gibi koyabiliriz

  Scenario: TC02 Sayfada Arama Yapar
    Then arama kutusunda java aratir
    And sayfa basliginin java icerdigini test eder



  Scenario: TC03 Sayfada Arama Yapar
    Then arama kutusunda mobile aratir
    When cikan dropdown da mobile developer linkine tiklar
    And sayfa basliginin Mobile icerdigini test eder
    And sayfayi kapatir

    #Scenario larimizin tek bir browser da calismasini istersek ve tum scenariolardan sonra browser'i kapatmak istersek
  #en son scenario'da close yapabiliriz.