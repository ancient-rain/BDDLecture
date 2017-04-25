@tag
Feature: Knight Movement
  In order to win the game,
  As a player,
  I want to move my knight to empty spaces.

  @tag1
  Scenario: Move up and left
    Given an empty chessboard
    And the black knight is placed on d 4
    When the black knight tries to move to c 6
    And the black knight is placed at c 6
    And yet another action
    Then I validate the outcomes
    And check more outcomes
