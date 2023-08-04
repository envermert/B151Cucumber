Feature: US001 Google Sayfasi Testi

  Background: Google sayfasina gidildi
    Given kullanici "googleUrl" sayfasina properties ile gider
  @volvo
  Scenario: TC01 Arama Kutusunda Volvo Aratilir
    Then kullanici aramaKutusunda "arac1" aratir
    And kullanici 2 saniye bekler
    And kullanici sayfa basliginin "arac2" icerdigini test eder
    And sayfayi kapatir

  Scenario: TC02 Arama Kutusunda Ford Aratilir
    * kullanici aramaKutusunda "arac2" aratir
    * kullanici 2 saniye bekler
    * kullanici sayfa basliginin "arac2" icerdigini test eder

  Scenario: TC03 Arama Kutusunda Audi Aratilir
    * kullanici aramaKutusunda "arac3" aratir
    * kullanici 2 saniye bekler
    * kullanici sayfa basliginin "arac3" icerdigini test eder
    * sayfayi kapatir

    #Daha once yazdiginiz steplerin methodlarini tekrar yazmak istediginizde And,Then ...
    # yerine * (yildiz) kullanabilirsiniz.