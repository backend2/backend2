package org.backend2.core.prop;

import org.backend2.core.DataSetter;

public class StringProp extends AbstractProp<String> {

	public StringProp(DataSetter<?> setter, int columnIndex) {
		super(setter, columnIndex);
	}

	@Override
	public String getValue() {
		return setter.getString(columnIndex);
	}

	@Override
	public void setValue(String value) {
		setter.setString(columnIndex, value);
	}
}
