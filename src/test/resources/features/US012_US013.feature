Feature: US012
  Scenario: TC01
    Given kullanici "autoUrl" sayfasina gider
    Then kullinici shop sekmesine tiklar
    When kullanici Home sekmesine tiklar
    When kullanici Arrivals sekmesine tiklar
    And kullanici kitabi sepete ekler
    And kullanici sepete tiklar
    When sepete eklenen kitap sayisini artirir
    And update basket butonu ile guncelleme yapilir
