package com.bridgelabz.tictactoeproblem;

public class TicTacToeGame {
	static char[] signArray=new char[10];
	
	public static void createArray() {
		for(int index=1;index<10;index++) {
			signArray[index]=' ';
		}
	}
	public static void main(String[] args) {
		createArray();
		
	}
}
