Feature: Automated API End2End Tests
  Description: The purpose of this feature is to test End 2 End integration.

  Background: User generates token for authorization
  Given: I am an authorized user

  Scenario Outline: Authorized user can able to add/remove from book store.
    Given A list of books are available
    When I add a book to my reading list
    Then The book is added
    When I remove a book from my reading list
    Then The book is removed
    Examples:
      | customer |
      | Lakshay  |