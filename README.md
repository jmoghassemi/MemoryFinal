# Memory Game 

This Java program creates the well-known "memory" game for two players. Each player can select two cards and if the cards' color is the same, that player will get a point. 
If the cards' color don't match, the player will not get a point and her/his turn is over. The game ends when there are no pair of cards left to select. 

The structure of this program consists of:

Visibility (enum)
Represents the visibility of a card: VISIBLE, INVISIBLE, ELIMINATED (player has found a pair).

Card (Class)
Represents a card/picture that can be turned (Visibility) and be visible, invisible, or eliminated.

Player (Class)
Represents a player who can be active or inactive (boolean), has points (int), and a name (String).

Game (Class)
Represents the game logic and keeps track of whose turn it is, which cards are available, and controls the BoardView. This class is also the main program with the main method.

BoardView (Class)
Represents the graphical interface and draws the cards, marks the active player, and flips the cards when someone clicks on a card, preferably represented as a subclass of JButton.