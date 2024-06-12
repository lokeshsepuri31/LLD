package com.example.lld.composite;

public class File implements FileSystem {

	String fileName;

	public File(String name) {
		this.fileName = name;
	}

	@Override
	public void ls() {
		System.out.println("The current file is: " + this.fileName);
	}

}
