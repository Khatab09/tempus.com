Feature: Smoke test


  Scenario: page load
    Given verify the browser url once the page loads.

  Scenario: click on about us and verify the url
    Given go to tempus and click on about us
    Then verify the url

    Scenario:Contact us
      Given go to tempus and click on contact us
      Then verify that tempus address is displayed
