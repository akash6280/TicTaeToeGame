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
		char choice=scanner.next().charAt(0);
		if(choice=='X') {
			playerLetter=choice;
			computerLetter='O';
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
	
	
	public static void main(String[] args) {
		createBoard();
		inputChoice();
		showBoard();
		
	}
}
