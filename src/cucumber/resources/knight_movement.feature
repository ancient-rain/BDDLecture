
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
	| d					 | 4					|	b			|	3			|
	| d					 | 4					|	b			|	5			|
	| h					 | 1					|	f			|	2			|
	
	Scenario Outline: invalid move on ally
		Given an empty chessboard
		And the <color> knight is placed on <original_x> <original_y>
		And a second <color> knight is placed on <second_x> <second_y>
		When the <color> knight tries to move to <new_x> <new_y>
		Then the <color> knight remains at <original_x> <original_y>
		And the user is told that the move failed
		
	Examples:
	| color | original_x | original_y | second_x | second_y | new_x | new_y |
	| black | d					 | 4				  | c			 	 | 6			  | c 		| 6		  |
	
	Scenario Outline: valid move not on ally
		Given an empty chessboard
		And the <color> knight is placed on <original_x> <original_y>
		And a second <color> knight is placed on <second_x> <second_y>
		When the <color> knight tries to move to <new_x> <new_y>
		Then the <color> knight remains at <new_x> <new_y>
		
	Examples:
	| color | original_x | original_y | second_x | second_y | new_x | new_y |
	| black | d					 | 4				  | c			 	 | 6			  | b 		| 5		  |
	
	Scenario Outline: invalid moves up, down, left, right
		Given an empty chessboard
		And the black knight is placed on <original_x> <original_y>
		When the black knight tries to move to <new_x> <new_y>
		Then the black knight remains at <original_x> <original_y>
		And the user is told that the move failed
		
	Examples:
	| original_x | original_y | new_x | new_y |
	| d					 | 4				  | d 		| 5		  |
	| d					 | 4				  | d 		| 3		  |
	| d					 | 4				  | c 		| 4		  |
	| d					 | 4				  | e 		| 4		  |
	| d					 | 4				  | d 		| 6		  |