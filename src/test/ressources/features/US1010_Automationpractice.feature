Feature: US1010 kullanici ile Automation test yapalım

  Scenario: TC11 kullanici test yapar
    Given kullanici "AutomationUrl"anasayfasinda
    And  kullanici sign in linkine tiklar
    And kullanici Create and account bölümüne email adresi girer
    And kullanici Create an Account butonuna basar
    And kullanici 3 sn bekler
    And kullanici kisisel bilgilerini ve iletisim bilgilerini girer
    And kullanici Register butonuna basar
    Then kullanici hesap olustugunu test eder




