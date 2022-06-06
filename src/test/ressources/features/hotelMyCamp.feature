Feature: MotelMyCamp giriş yapma


  Hamza Ersoy13:51
  https://www.hotelmycamp.com
  adresine git
  login butonuna bas
  test data username:
  manager
  test data password :
  Manager 1
  Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et

  Scenario: kullanicinin HotelMyCamp sayfasina giris yapmasi
    Given kullanici hotelmycamp anasayfasina gider
    Then kullanici login butonuna basar
    When kullanici username giris yapar
    When kullanici password giris yapar
    When kullanici ikinci login tıklar
    And kullanici Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et
    And sayfayi kapatir