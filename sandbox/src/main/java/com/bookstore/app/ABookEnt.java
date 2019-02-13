package com.bookstore.app;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.backend2.core.DataSetterEmpty;
import org.backend2.core.Ent;
import org.backend2.core.Prop;
import org.backend2.core.prop.IntProp;
import org.backend2.core.prop.StringProp;

class ABookEnt implements Ent {
	private final ABook book;
	private final Setter setter;
	//
	public final IntProp size;
	public final StringProp name;

	private static class Setter extends DataSetterEmpty<ABook> {

		public Setter(ABook data) {
			super(data);
		}

		@Override
		public int getInt(int columnIndex) {
			if (columnIndex == 1) {
				return data.getSize();
			}
			return super.getInt(columnIndex);
		}

		@Override
		public void setInt(int columnIndex, int value) {
			if (columnIndex == 1) {
				data.setSize(value);
				return;
			}
			super.setInt(columnIndex, value);
		}

		@Override
		public String getString(int columnIndex) {
			if (columnIndex == 2) {
				return data.getName();
			}
			return super.getString(columnIndex);
		}

		@Override
		public void setString(int columnIndex, String value) {
			if (columnIndex == 2) {
				data.setName(value);
				return;
			}
			super.setString(columnIndex, value);
		}
	}

	ABookEnt() {
		this(new Book());
	}

	ABookEnt(ABook book) {
		this.book = book;
		this.setter = new Setter(book);
		//
		size = new IntProp(setter, 1);
		name = new StringProp(setter, 2);
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
