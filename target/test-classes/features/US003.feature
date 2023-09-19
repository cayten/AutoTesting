Feature: US003
  Scenario: TC01
    Given kullanici "autoUrl" sayfasina gider
    Then kullnici 2 saniye bekler
    When kullinici shop sekmesine tiklar
    And kullanici Home sekmesine tiklar
    When kullanici Arrivals sekmesine tiklar
    And secilen kitapin sepete eklenip eklenecegi sayfaya gidip gidilmedigini test eder
    And kullanici sayfayi kapatir
