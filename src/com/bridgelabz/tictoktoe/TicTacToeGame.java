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

	public static void main(String[] args) {
		System.out.println("Welcome To Game");
		System.out.println("~Tic-Tac-Toe~");
		System.out.println();
		showBoard();
		Choice();

	}
}