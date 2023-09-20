Feature: US005
  Scenario: TC01
    Given kullanici "autoUrl" sayfasina gider
    Then kullinici shop sekmesine tiklar
    And kullanici Home sekmesine tiklar
    When kullanici Arrivals sekmesine tiklar
    And kullanici kitap resmine tiklar ve kapatir
    When kullanici kitabi sepete ekler
    And kullanici sepete tiklar
    When bir onceki sayfaya donulur







