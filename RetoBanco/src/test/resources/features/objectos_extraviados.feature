Feature: I, as a user of the Tocumen application,
  should observe the pdf of plots of lost objects

  Background:
    Given that the user is on the main page
    When in the page traveler information

  Scenario: Smoke test
      Then verify existence of the download button

  Scenario: PDF validation successfully
    When download policy PDF
    Then in the pdf you should see the title of Objetos Decomisados
