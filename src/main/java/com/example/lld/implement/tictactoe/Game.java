package com.example.lld.implement.tictactoe;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Game {

	Deque<Player> players;
	Board board;
	Scanner scan = new Scanner(System.in);

	public Game() {
		initializeGame();
	}

	private void initializeGame() {
		players = new LinkedList<Player>();
		
		PlayerPieceFactory playerPieceFactory = new PlayerPieceFactory();
		PlayingPiece playerPiece1 = playerPieceFactory.getPlayerPiece('X');
		PlayingPiece playerPiece2 = playerPieceFactory.getPlayerPiece('O');
		
		Player player1 = new Player("Lokesh", playerPiece1);
		Player player2 = new Player("Abhsihek", playerPiece2);
		
		players.add(player1);
		players.add(player2);
		
		board = new Board(3);
		
	}
	
	public String startGame() {
		boolean noWinner = true;
		
		while(noWinner) {
			
			Player player = players.removeFirst();
			
			board.printBoard();
			List<Integer> freeSpace = board.getFreeCells(Integer.class);
			
		}
		
		return "tie";
	}
}
