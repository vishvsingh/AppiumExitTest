Feature: App testing of Apidemo apk
  User want to check functionality of app section
@Tag
  Scenario: Action Bar test in App section
    Given Launch ApiDEmo Application
    And Touch on App section
    And Touch on Action Bar section
    When Touch on Action Bar Tabs section
    Then It should on Expected page
