<h1>Tic Tac Toe Game</h1>

A simple Tic Tac Toe game created in Java, where two players alternate between 'X' and 'O' until one of them wins or the game ends in a draw.

## 🕹️ How to Play

1 - Run the program

2 - The game will display the board

3 - Follow the prompts to enter the row and column where you want play, with values ranging from 0 to 2.

4 - The game continues until one player wins or a draw occurs.

##  <img align="center" alt="Imagem Java" height="35" width="40" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/java/java-original.svg"> Code Structure 

<h3>Libraries</h3>
  
* ```java.util.Scanner``` = For user input

<h3>Variables</h3>

* ```char[][]``` = Represents the game board
* ```char currentPlayer``` = Indicates the current player ('X' or 'O')
* ```Scanner scanner``` = Used to read user input

<h3>Methods</h3>

* ```main(String[] args)``` = Starts the game
* ```startBoard()``` = Initalizes the game board
* ```displayBoard()``` = Displays the board in the console
* ```makeMove(Scanner scanner)``` = Receives and validates the player's move
* ```switchPlayer()``` = Switches the current player
* ```checkVictory()``` = Checks if the current player has won
* ```checkDraw()``` = Checks if the game ended in a draw

<h3>Structures</h3>

* while, if, for = These control flow are essential for making the program work in an interactive and dinamic way
