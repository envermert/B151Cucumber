Feature: US001_Amazon_Urun_Arama_Testi
    Scenario: TC01_Amazonda_iphone_aramasi
      Given kullanici amazon sayfasina gider
      Then kullanici aramaKutusunda iphone aratir
      And sayfayi kapatir

      Scenario: TC02 Arama kutusunda urun aratma
        Given kullanici amazon sayfasina gider
        Then kullanici aramaKutusunda shaomi aratir
        And sayfayi kapatir