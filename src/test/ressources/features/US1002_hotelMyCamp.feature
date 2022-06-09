Feature: US1002 MotelMyCamp giriş yapma


  Scenario: kullanicinin HotelMyCamp sayfasina giris yapmasi
    Given kullanici hotelmycamp anasayfasina gider
    Then kullanici login butonuna basar
    When kullanici username giris yapar
    When kullanici password giris yapar
    When kullanici ikinci login tıklar
    And kullanici Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et
    And sayfayi kapatir