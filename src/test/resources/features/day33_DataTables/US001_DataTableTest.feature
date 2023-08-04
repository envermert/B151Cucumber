#Feature: US001 Google Sayfasinda Urun Aramasi
Feature: US001 Google Sayfasinda Urun Aramasi

  #Scenario: TC01 Arama Kutusunda Verilen Urunler Aratilir
  @googleUrunler
  Scenario: TC01 Arama Kutusunda Verilen Urunler Aratilir
    Given kullanici "googleUrl" sayfasina properties ile gider
    And kullanici data tableda verilen bilgileri aratir
      | Urunler  |
      | nokia    |
      | samsung  |
      | iphone   |
      | motorola |
    And sayfayi kapatir







    #AltGr+<> basarak --> bu sembole ulasiriz.-->  |
  #option+- --> mac icin

  #DataTable Scenario Outline daki gibi birden fazla veriyi ayni scenario'da test etmek icin kullanilir
  #Scenari Outline 'dan farkli olarak verilerle ilgili tablolari istedigimiz stepten sonra kendimiz olusturabiliriz
  #Tabloyu olusturdugumuz step'in method'una parametre olarak cucumber.io dan DataTable parametresini ekleriz
  #Bu parametre sayesinde olusturmus oldugumuz tabloyu bir list'e donusturup loop ile verileri kullanabiliriz
  #Birden fazla sutun olusturduysak yine DataTable parametresi sayesinde excel'den bildigimiz row() methodu ile
  #bu datalara ulasabiliriz.