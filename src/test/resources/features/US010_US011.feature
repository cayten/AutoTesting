Feature: US010_US011
  Scenario: TC01
    Given kullanici "autoUrl" sayfasina gider
    Then kullinici shop sekmesine tiklar
    When kullanici Home sekmesine tiklar
    When kullanici Arrivals sekmesine tiklar
    And kullanici 450 tl altindaki kitap2 yi sepete ekler
    When kullanici kupon kodu girer
    And 450 tl altinda oldugu icin kuponun gercerli olmadigini test eder
    When kullanici 450 tl uzeri kitap1 yi sepete ekler
    And kullanici kupon kodu girer
    When 450 tl uzeri oldugu icin kupon kodunun gecerli oldugunu test eder