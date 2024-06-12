package com.example.lld.composite;

public class Main {

	public static void main(String[] args) {
		
		Directory directory = new Directory("Movies");
		
		Directory comedyMovieDirectory = new Directory("Comedy Movies");
		Directory horrorMovieDirectory = new Directory("Horror Movies");
		
		FileSystem file = new File("Kick");
		
		comedyMovieDirectory.fileSystemList.add(file);
		
		directory.fileSystemList.add(comedyMovieDirectory);
		directory.fileSystemList.add(horrorMovieDirectory);
		
		directory.ls();
		
	}
}
