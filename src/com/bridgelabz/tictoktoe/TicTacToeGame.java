package com.bridgelabz.tictoktoe;

public class TicTacToeGame {

	char[] board = showBoard();

	public static char[] showBoard() {
		char[] board = new char[10];
		for (int i = 0; i < board.length; i++) {
			board[i] = ' ';
		}
		return board;

	}

	public static void main(String[] args) {
		System.out.println("Welcome To Game ~Tic-Tac-Toe~ ");
		showBoard();
	}
}