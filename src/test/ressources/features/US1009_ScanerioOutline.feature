#amazon sayfasına gidip sırasıyla nutella, java,elma,armut aratıp
# sonuçların arama yaptığınız kelimeyi içerdiğini test edelim

Feature: US1009 kullanıcı amazonda istediği kelimeleri aratır

  @outline
  Scenario Outline: TC10 amazonda listedeki elementleri aratma
    Given kullanici "amazonUrl"anasayfasinda
    Then kullanici "<istenenKelime>" icin arama yapar
    And kullanici 3 sn bekler
    And sonuclarin "<istenenKelimeKontrol>" icerdiğini test eder
    And sayfayi kapatir


    Examples:

      | istenenKelime | istenenKelimeKontrol |
       |nutella       |java                  |
       |elma          |armut                 |