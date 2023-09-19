Feature:US001
  Scenario: TC01
    Given kullanici "autoUrl" sayfasina gider
    Then kullnici 2 saniye bekler
    When kullinici shop sekmesine tiklar
    And kullanici Home sekmesine tiklar
    When kullanici anasayfada uc tane kaydirici oldugunu test eder
    And kullanici sayfayi kapatir