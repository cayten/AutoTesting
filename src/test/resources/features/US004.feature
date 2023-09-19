Feature: US004
  Scenario: TC01
    Given kullanici "autoUrl" sayfasina gider
    Then kullnici 2 saniye bekler
    When kullinici shop sekmesine tiklar
    And kullanici Home sekmesine tiklar
    When kullanici Arrivals sekmesine tiklar
    And description bolumunun gorunurlugu test edilir
    When kitap sekmesine basildiktan sonra kitap aciklamasi olmalidir
    And kullanici sayfayi kapatir
