package com.bridgelabz.tictoktoe;

import java.util.Scanner;

public class TicTacToeGame {

	static char[] board = showBoard();

	public static char[] showBoard() {
		char[] board = new char[10];
		for (int i = 0; i < board.length; i++) {
			board[i] = ' ';
		}
		return board;

	}

	static String Choice() {

		Scanner input = new Scanner(System.in);

		System.out.println("Just Choose Any One Mark For Start The Game");
		System.out.println("       :X: & :O:        ");
		String user = input.next();
		System.out.println("Player Play's = " + user);

		if (user.equals("X")) {
			String computer = "O";
			System.out.println("Computer Play's = " + computer);
			return computer;
		} else {
			String computer = "X";
			System.out.println("Computer Play's = " + computer);
			return computer;
		}
	}
	private static void showBoard(char[] board) {
		System.out.println("\n" + board[1] + "  |  " + board[2] + "  |  " + board[3]);
		System.out.println("-------------");
		System.out.println("\n" + board[4] + "  |  " + board[5] + "  |  " + board[6]);
		System.out.println("-------------");
		System.out.println("\n" + board[7] + "  |  " + board[8] + "  |  " + board[9]);
	}

	public static void main(String[] args) {
		System.out.println("Welcome To Game");
		System.out.println("~Tic-Tac-Toe~");
		System.out.println();
		showBoard();
		Choice();
		showBoard(board);
	}
}