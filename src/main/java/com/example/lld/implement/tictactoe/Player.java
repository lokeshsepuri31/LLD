package com.example.lld.implement.tictactoe;

public class Player {

	private PlayingPiece playingPiece;
	private String name;
	
	public Player(String name, PlayingPiece playingPiece) {
		this.name = name;
		this.playingPiece = playingPiece;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public PlayingPiece getPlayingPiece() {
		return this.playingPiece;
	}
	
	public void setPlayingPiece(PlayingPiece playingPiece) {
		this.playingPiece = playingPiece;
	}
}
