package com.example.lld.composite;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem {

	String name;
	List<FileSystem> fileSystemList;

	public Directory(String name) {
		this.name = name;
		this.fileSystemList = new ArrayList<FileSystem>();
	}

	@Override
	public void ls() {
		System.out.println("The current directory is: " + this.name);
		for (FileSystem fileSystem : this.fileSystemList) {
			fileSystem.ls();
		}
	}
}
