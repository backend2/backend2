package com.bookstore.app;

import org.backend2.core.Data;
import org.backend2.core.DataSetter;
import org.backend2.core.DataSetterEmpty;
import org.backend2.core.Name;

class ABook implements Data<BookEnt> {
	
	// SIZE
	public static final Name SIZE = null;
	//
	private int size;
	private String name;
	//
	private BookEnt entity;
	
	private DataSetter setter;
	
	//private static class Setter 
	
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

	public synchronized DataSetter setter() {
		if (setter == null) {
			setter = new ABookSetter(this);
		}
		return setter;
	}
}
