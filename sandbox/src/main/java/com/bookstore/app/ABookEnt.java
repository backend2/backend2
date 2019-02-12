package com.bookstore.app;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.backend2.core.Ent;
import org.backend2.core.Prop;
import org.backend2.core.prop.IntProp;

class ABookEnt implements Ent {
	private final ABook book;

	public IntProp size = new IntProp() {

		@Override
		public void set(int size) {
			book.setSize(size);
		}

		@Override
		public int get() {
			return book.getSize();
		}
	};
	
	public Prop<String> name = new Prop<String>() {

		public String getValue() {
			return book.getName();
		}

		public void setValue(String name) {
			book.setName(name);
		}
		
	};

	public Prop<String> p2 = new Prop<String>() {

		public String getValue() {
			return book.getName();
		}

		public void setValue(String name) {
			book.setName(name);
		}
		
	};

	ABookEnt() {
		this(new Book());
	}

	ABookEnt(ABook book) {
		this.book = book;
		propertiesMap.put("size", size);
		propertiesMap.put("name", name);
	}

	private Map<String, Prop<?>> propertiesMap = new HashMap<String, Prop<?>>();

	public Collection<Prop<?>> properties() {
		return propertiesMap.values();
	}

	public Object getPropertyValue(String propertyName) {
		return propertiesMap.get(propertyName).getValue();
	}

	public void setPropertyValue(String propertyName, Object value) {
		((Prop<Object>) propertiesMap.get(propertyName)).setValue(value);
	}
}
