package com.annotations;

import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Component;
@Component
public class Books {

private String author;

private Booktype books;

public String getAuthor() {
	return author;
}

public void setAuthor(String author) {
	author = author;
}

public Booktype getBooks() {
	return books;
}

public void setBooks(Booktype books) {
	this.books = books;
}


}




