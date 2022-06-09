
@wip
Feature: US1003 kullanici ortak adimlari ile Background ile calistirir

  Background: ortak adim
    Given kullanici amazon anasayfasina gider

    Scenario: TC04 amazon nutelle arama
      And kullanici amazonda nutella aratir
      Then sonuclarin nutella icerdiğini test eder
      And sayfayi kapatir

    Scenario: TC05 amazon java arama yapar
      And kullanici amazonda java aratir
      Then sonuclarin java icerdiğini test eder
      And sayfayi kapatir