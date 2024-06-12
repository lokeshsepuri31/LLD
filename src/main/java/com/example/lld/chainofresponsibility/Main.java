package com.example.lld.chainofresponsibility;

public class Main {

	public static void main(String[] args) {
		
		InfoLogProcessor infoLogProcessor = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));
		
		infoLogProcessor.log(LogProcessor.ERROR, "This is for ErrorLogProcessor.");
		infoLogProcessor.log(LogProcessor.DEBUG, "This is for DebugLogProcessor.");
		infoLogProcessor.log(LogProcessor.INFO, "This is for InfoLogProcessor.");
		
	}
}
