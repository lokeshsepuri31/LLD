package com.example.lld.implement.tictactoe;

public class PlayerPieceFactory {

	public PlayingPiece getPlayerPiece(char piece) {
		switch (piece) {
		case 'X':
			return new PlayingPieceX();
		case 'O':
			return new PlayingPieceO();
		default:
			return null;
		}
	}
}
