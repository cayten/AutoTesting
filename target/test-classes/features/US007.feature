Feature: US007
  Scenario: TC01
    Given kullanici "autoUrl" sayfasina gider
    Then kullinici shop sekmesine tiklar
    When kullanici Home sekmesine tiklar
    When kullanici Arrivals sekmesine tiklar
    And kullanici kitabi sepete ekler
    When kitabin stok sayisi kadar sepete ekler
    And kullanici sepete tiklar

