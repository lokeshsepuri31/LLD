package com.example.lld.implement.tictactoe;

import java.util.ArrayList;
import java.util.List;

public class Board {

	int size;
	PlayingPiece[][] board;
	
	Board(int size){
		this.size = size;
		this.board = new PlayingPiece[size][size];
	}
	
	public void printBoard() {
		
	}
	
	public <T> List getFreeCells(T type) {
			
		return new ArrayList();
	}
}
