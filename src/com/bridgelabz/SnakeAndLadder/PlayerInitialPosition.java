package com.bridgelabz.SnakeAndLadder;
/*
 * @author : Ashwini
 * Snake and Ladder game played with single player at start position 0
 */
public class PlayerInitialPosition {
	//Declaring Variables for Players Position
    int playerPosition = 0;

    //Method to Show Player Current Position
    private void showPosition() {
        //Displaying Player Position
        System.out.println("Player Starting Position = "+ playerPosition);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Displaying Welcome Message
        System.out.println("Welcome to Snake and Ladder Simulator Problem.");

        //Creating Object for Player
        PlayerInitialPosition player1 = new PlayerInitialPosition();

        //Showing Player Position
        player1.showPosition();
	}

}
