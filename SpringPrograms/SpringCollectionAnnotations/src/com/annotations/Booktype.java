package com.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class Booktype {
@Autowired
@Qualifier("book")
private String booktypes;

public String getBooktypes() {
	return booktypes;
}

public void setBooktypes(String booktypes) {
	this.booktypes = booktypes;
}
}
