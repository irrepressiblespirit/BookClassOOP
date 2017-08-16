package com.viking.task2;

public class Book {
	
	public Book(int pc,int partC,String auth,String nm,String bind,String is,double pr,String pub,int year) {
	this.pageCount=pc;
	this.partCount=partC;
	this.author=auth;
	this.name=nm;
	this.binding=bind;
	this.isbn=is;
	this.price=pr;
	this.publishing=pub;
	this.yearOfPublishing=year;
}
private int pageCount;
private int partCount;
private String author;
private String name;
private String binding;
private String isbn;
private double price;
private String publishing;
private int yearOfPublishing;

public String getAuthor() {
	return author;
}

public String getName() {
	return name;
}

}
