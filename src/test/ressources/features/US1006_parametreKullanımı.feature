
  Feature: US1006 kullanici ile parametre kullanarak amazon sayfasında arama yapar

    @iphone
    Scenario: TC06 kullanici amazonda arama yapar

      Given kullanici "amazonUrl" anasayfasinda
      Then kullanici "iphone 13 256GB" arama yapar
      And sonuclarin "iphone 13 256 GB" icerdiğini test eder
      And sayfayi kapatir

