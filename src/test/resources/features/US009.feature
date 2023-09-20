Feature: US009
  Scenario: TC01
    Given kullanici "autoUrl" sayfasina gider
    Then kullinici shop sekmesine tiklar
    When kullanici Home sekmesine tiklar
    When kullanici Arrivals sekmesine tiklar
    And kullanici kitabi sepete ekler
    When kullanici sepete tiklar
    And kullanici kupon kodu girer
    When kullanici aply coupon sekmesine tiklar
    And kuponun 450 lira uzeri kitaplarda gecerli oldugu test edilir

