Feature: Email login page validation

  Scenario: Verify email login
    Given I navigate to the url "https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin"
    Then  i should navigate to the home page
    When I enter the emailId and click next button
    When I enter the password and click next button
    Then I close the browser