package com.bookstore.app;

import org.backend2.core.DataSetterEmpty;

public class ABookSetter extends DataSetterEmpty<ABook> {

	public ABookSetter(ABook data) {
		super(data);
	}
	
	@Override
	public void setInteger(int columnIndex, Integer value) {
		if (columnIndex == 1) {
			data().setSize(value.intValue());
			return;
		}
		super.setInteger(columnIndex, value);
	}
	
	@Override
	public void setString(int columnIndex, String value) {
		if (columnIndex == 2) {
			data().setName(value);
			return;
		}
		super.setString(columnIndex, value);
	}		
}