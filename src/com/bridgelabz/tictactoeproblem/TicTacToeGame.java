package com.bridgelabz.tictactoeproblem;

import java.util.Scanner;

public class TicTacToeGame {
	static Scanner scanner=new Scanner(System.in);
	static char[] board=new char[10];
	static char playerLetter;
	static char computerLetter;
	
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
		}
		else {
			System.out.println("Computer plays first");
		}
	}

	public static void main(String[] args) {
		createBoard();
		inputChoice();
		showBoard();
		playerMove();
		decideFirstPlayer();
		
	}
}
