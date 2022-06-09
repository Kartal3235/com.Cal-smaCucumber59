
  Feature: US1005 kullanici parametre ile Configuration file'i kullanabilmeli
    @config
    Scenario: TC07 configurations properties dosyasından parametre kullanimi
      Given kullanici "techproeducationUrl"anasayfasinda
      Then kullanici 10 sn bekler
      And url'nin "techproeducation" icerdiğini test eder
      Then sayfayi kapatir
