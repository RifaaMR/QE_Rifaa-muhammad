@product
Feature: product

  Scenario Outline: As a user i can select product on homepage
    Given I open sepulsa.com homepage
    When I press at "<product>" product icon
    Then I will be directed to the correct "<product>" product page
    Examples:
      | product               |
      | Pulsa                 |
      | Voucher Game          |


