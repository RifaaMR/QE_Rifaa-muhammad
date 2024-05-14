Feature: Login

  Scenario Outline: [POS] - Check when user tries to login using registered email
    Given android user has successfully register
    When android user input registered email
    And android user input password: "<password>"
    And android user tap login button
    Then android user see email message displayed on home screen
    Examples:
      | password          |
      | test@1234         |

  Scenario Outline: [NEG] - Check when user tries to login using unregistered email
    Given android user on landing screen
    When android user input unregistered email: "<email>"
    And android user input password: "<password>"
    And android user tap login button
    Then android user see "Wrong Email or Password" message
    Examples:
    | email             | password          |
    | testing@gmail.com | test@1234         |
    | cek@gmail.com     | Haloo12331!       |




