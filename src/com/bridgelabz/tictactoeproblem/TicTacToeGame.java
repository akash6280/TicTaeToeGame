package com.bridgelabz.tictactoeproblem;

import java.util.Scanner;

public class TicTacToeGame {
	static Scanner scanner=new Scanner(System.in);
	static char[] board=new char[10];
	static char playerLetter;
	static char computerLetter;
	static char currentPlayer;
	static int positionRemainnig=9;
	static int [][] winningPositions = {{1,2,3}, {4,5,6}, {7,8,9}, {1,4,7}, {2,5,8}, {3,6,9},{1,5,9}, {3,5,7}};
	
	public static void createBoard() {
		for(int index=1;index<10;index++) {
			board[index]=' ';
		}
	}
	public static void inputChoice() {
		System.out.println("Enter user choice");
		char choice=scanner.next().toUpperCase().charAt(0);
		if(choice=='X') {
			playerLetter=choice;
			computerLetter='O' ;
		}
		else{
			playerLetter=choice;
			computerLetter='X';
			
		}
	}
	public static void showBoard() {
		int count =0;
		for(int index=1;index<=9;index++) {
			if(count==3) {
				count=0;
				System.out.println();
			}
			++count;
			System.out.print((board[index])+"|");
		}
	}
	
	public  static void playerMove() {
		System.out.println("Enter position form 1 to 9 to make your move");
		int position = scanner.nextInt();
		
		if (position<1 || position>9) {
			System.out.println("Wrong input");
			playerMove();
		}
		if(board[position]==' ') {
			board[position] = playerLetter;
		}
		else{
			System.out.println("This position is filled");
			playerMove();
			}
	}
	
	public static void decideFirstPlayer() {
	
		System.out.println("enter user's toss choice head 0 and tail 1");
		int tossChoice=scanner.nextInt();
		int tossResult=(int)Math.floor(Math.random()*10)%2;
		
		if(tossResult==tossChoice) {
			System.out.println("user play first");
			currentPlayer='X';
		}
		else {
			System.out.println("Computer plays first");
			currentPlayer='O';
		}
	}
	public static void checkWinner(){
		if(positionRemainnig == 0) {
			System.out.println("the game ended in a tie");
			return;
		}
		
		for(int i=0;i<8;i++) {
			if(board[winningPositions[i][0]] == currentPlayer && board[winningPositions[i][1]] == currentPlayer && board[winningPositions[i][2]] == currentPlayer) {
				System.out.println("The "+(currentPlayer == 1?"User":"Computer")+" is the winner****");
				return;
			}
		}
		currentPlayer = (currentPlayer=='X')?'0':'X';
	}
	
	

	public static void main(String[] args) {
		createBoard();
		inputChoice();
		showBoard();
		playerMove();
		decideFirstPlayer();
		checkWinner();
		
	}
}
