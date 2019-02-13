package com.bookstore.app;

import org.backend2.core.Data;
import org.backend2.core.Name;

class ABook implements Data<BookEnt> {
	
	// SIZE
	public static final Name SIZE = null;
	//
	private int size;
	private String name;
	//
	private BookEnt entity;
		
    ABook () {		
	}
	
	public int getSize() {
		return size;
	}
	
	public void setSize(int size) {
		this.size = size;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public synchronized BookEnt entity() {
		if (entity == null) {
			entity = new BookEnt(this);
		}
		return entity;
	}
}
