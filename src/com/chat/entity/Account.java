package com.chat.entity;

import java.io.BufferedReader;
import java.io.PrintWriter;

public class Account {
	
	private String name;
	private BufferedReader reader;
	private PrintWriter writer;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BufferedReader getReader() {
		return reader;
	}
	public void setReader(BufferedReader reader) {
		this.reader = reader;
	}
	public PrintWriter getWriter() {
		return writer;
	}
	public void setWriter(PrintWriter writer) {
		this.writer = writer;
	}
	
	
	
}
