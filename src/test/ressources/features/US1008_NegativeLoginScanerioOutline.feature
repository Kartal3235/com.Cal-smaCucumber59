Feature: US1008 kullanici farklı yanlış sifre ve kullanıcı adyla giriş yapamaz
  Scenario Outline: TC08 yanlış kullanıcı adı ve sifrelerle giriş yapılmaz

    Given kullanici "HMCUrl"anasayfasinda
    Then kullanici login butonuna basar
    And gecersiz username olarak "<username>" girer
    And gecersiz password olarak "<password>" girer
    And kullanici ikinci login tıklar
    Then sayfaya giris yapılamadığını test eder
    And sayfayi kapatir

    Examples:
      | username | password |
       |Manaager5!|Manager5! |
      |Manaager6!|Manager6! |
      |Manaager7!|Manager7! |
      |Manaager8!|Manager8! |
      |Manaager9!|Manager9! |

