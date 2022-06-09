Feature: US1012 kullanici gittigidyor sitesinde ürün arama

  @gittigidiyor
  Scenario: TC12 kullanici gittigidyor sitesinde
    Given kullanici "GittigidiyorUrl" anasayfasinda
    Then kullanici "{string}" aratir
    And kullanici "{string}" test eder
    And kullanici "ılkUrun" secer
    And kullanici urun bilgisini yazdırır
    And kullanici "ilkUrun" sepete ekler
    And kullanici "ılkUrun" fiyat dogrulugunu karşılaştırır
    And kullanici "ılkUrun" sepetten silerek sepetin boş oldugunu kontrol eder
    * sayfayi kapatir


























