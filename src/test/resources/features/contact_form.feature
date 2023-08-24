Feature: Submitting the contact form

  Background: User is on the contact page
    Given Marco is on the contact page

  Scenario: Successful form submission with valid data
    When he enter valid data into the form
    And he submit the form
    Then he should see a confirmation of successful submission

  Scenario: Form submission with missing required data
    When he provides all details except the First Name
    And he attempts to submit the form
    Then he should be unsuccessful and highlight missing First Name

  Scenario: Validating the correctness of email format
    When he enters valid details for all fields except the Email
    And he attempts to submit the form
    Then he should be halted and alerted to correct the email format