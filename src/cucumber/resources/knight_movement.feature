
Feature: Knight Movement
  In order to win the game,
  As a player,
  I want to move my knight to empty spaces.

  Scenario Outline: valid moves
    Given an empty chessboard
    And the black knight is placed on <original_x> <original_y>
    When the black knight tries to move to <new_x> <new_y>
    And the black knight is placed at <new_x> <new_y>

	Examples:
	| original_x | original_y | new_x | new_y |
	| d					 | 4					|	c			|	6			|
	| d					 | 4					|	e			|	6			|
	| d					 | 4					|	f			|	5			|
	| d					 | 4					|	f			|	3			|
	| d					 | 4					|	e			|	2			|
	| d					 | 4					|	c			|	2			|