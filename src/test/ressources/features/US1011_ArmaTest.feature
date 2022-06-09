Feature: US1011 kullanici amazonda java ,elma, armut aratır

  Scenario Outline: TC12 kullanici amazonda arama yapar

    Given kullanici "amazonUrl"anasayfasinda
    Then  kullanici "<istenenKelime>" arama yapar
    And   sonuclarin"<istenenKelime>" icerdigini test eder
    And  sayfayi kapatir

    Examples:
      | istenenKelime |
      | java          |
      | elma          |
      | nutella       |
      | armut         |