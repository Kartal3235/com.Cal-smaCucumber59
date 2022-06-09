Feature: Amazon Search

  @flower
  Scenario: kullanici amazonda flower aratir
    Given kullanici amazon anasayfasina gider
    Then kullanici amazonda flower aratir
    And sonuclarin flower icerdiğini test eder
    And sayfayı kapatir

    @nutella
  Scenario: kullanici amazonda nutella aratir
    Given kullanici amazon anasayfasina gider
    Then kullanici amazonda nutella aratir
    And sonuclarin nutella icerdiğini test eder
    And sayfayi kapatir