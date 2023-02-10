Feature: Validate CRUD operations

  Scenario Outline: Validate if user is able to perfrom crud operation

    When Make a POST API call
    Then Verify the post API call
    Examples:
