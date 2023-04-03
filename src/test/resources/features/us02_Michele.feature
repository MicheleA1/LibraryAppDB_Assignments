@US02
Feature: As a librarian, I want to know the number of borrowed books.
@wip @ui @db
Scenario: verify the total number of borrowed books
  Given the "librarian" is on the home page
  When the librarian sees the borrowed books number
  Then the borrowed books number info should match database
