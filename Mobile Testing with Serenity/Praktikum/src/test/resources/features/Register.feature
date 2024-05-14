Feature: Registration

  Scenario Outline: [POS] - Check when user tries to register given valid credentials
    Given android user on landing screen
    When android user select register hyperlink
    And android user fill valid random name
    And android user fill valid non-registered email
    And android user fill valid password as: "<password>"
    And android user fill valid password confirmation "<password>"
    And android user press register
    Then android user see "Registration Successful" message on registration page
    Examples:
      | password          |
      | test@1234         |

  Scenario Outline: [NEG] - Check when user tries to register given invalid credentials
    Given android user on landing screen
    When android user select register hyperlink
    And android user fill valid random name
    And android user fill invalid email: "<email>"
    And android user fill valid password as: "<password>"
    And android user fill valid password confirmation "<password>"
    And android user press register
    Then android user see "Enter Valid Email" message below email form
    Examples:
      | password          | email       |
      | test@1234         | aisdiajd    |

  Scenario Outline: [NEG] - Check when user tries to register given invalid password confirmation
    Given android user on landing screen
    When android user select register hyperlink
    And android user fill valid random name
    And android user fill valid non-registered email
    And android user fill valid password as: "<password>"
    And android user fill non-matching password confirmation "<wrong-password>"
    And android user press register
    Then android user see "Password Does Not Matches" message below password form
    Examples:
      | password          | wrong-password    |
      | test@1234         | test@123456       |
