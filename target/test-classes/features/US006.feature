Feature: US006
  Scenario: TC01
    Given kullanici "autoUrl" sayfasina gider
    Then kullinici shop sekmesine tiklar
    When kullanici Home sekmesine tiklar
    When kullanici Arrivals sekmesine tiklar
    And kullanici reviews bolumunun gorunurlugunu test eder
    When kullanici kitabi sepete ekler
    And kullanici sepete tiklar
    When kitabin fiyatinin gorunurlugu test edilir
