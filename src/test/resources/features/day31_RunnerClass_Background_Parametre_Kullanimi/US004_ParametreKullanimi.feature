@enver
Feature: US004 TechProEducation Arma Testi
@parametre
  Scenario: TC01 Sayfada Arama Yapar
    Given kullanici "https://techproeducation.com" sayfasina gider
    Then arama kutusunda "mobile" aratir
    And kullanici 2 saniye bekler
    When cikan dropdown da mobile developer linkine tiklar
    And kullanici 1 saniye bekler
    And sayfa basliginin "Mobile" icerdigini test eder
    And sayfayi kapatir

  Scenario: TC02 Sayfada Arama Yapar
    Given kullanici "https://techproeducation.com" sayfasina gider
    Then arama kutusunda "qa" aratir
    And sayfayi kapatir

  Scenario: TC03 Sayfada Arama Yapar
    Given kullanici "https://techproeducation.com" sayfasina gider
    Then arama kutusunda "Java" aratir
    And sayfayi kapatir
  
  Scenario: TC04 Facebook sayfasina gidilir
    Given kullanici "https://facebook.com" sayfasina gider

  Scenario: TC05 Techpro sayfasina gidilir Java aratilir
  Given kullanici "https://techproeducation.com" sayfasina gider
  Then arama kutusunda "java" aratir
  And sayfayi kapatir

       #Parametreli method kullanimi icin file da "" icine aramak istedigimiz kelimeyi yazariz.
    # Daha sonra step definition da bir tane parametreli method olusturur.
  #Parametreli bir method olusturdugu icin file sadece istedigimiz kelimeyi degistirerek bunu birden fazla kez kullanabiliriz