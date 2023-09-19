Feature: US002
  Scenario: TC01
    Given kullanici "autoUrl" sayfasina gider
    Then kullnici 2 saniye bekler
    When kullinici shop sekmesine tiklar
    And kullanici Home sekmesine tiklar
    When kullanici anasayfada uc tane arrivals oldugunu test eder
    When uc tane arrivals icermelidir
    And kullanici sayfayi kapatir