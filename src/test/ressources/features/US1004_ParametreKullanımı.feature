Feature: 1004 kullanici parametre kullanarak arama yapabilmeli

  @parametre
  Scenario: TC06 kullanici parametre ile amazonda arama yapabilmeli
    Given kullanici amazon anasayfasina gider
    And kullanici "nutella" aratir
    And sonuclarin "Kutella" icerdiğini test eder
    And sayfayi kapatir