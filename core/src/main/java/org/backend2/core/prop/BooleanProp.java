package org.backend2.core.prop;

import org.backend2.core.DataSetter;

public class BooleanProp extends AbstractProp<Boolean> {

	public BooleanProp(DataSetter<?> setter, int columnIndex) {
		super(setter, columnIndex);
	}

	@Override
	public Boolean getValue() {
		return setter.getBoolean(columnIndex);
	}

	@Override
	public void setValue(Boolean value) {
		setter.setBoolean(columnIndex, value);
	}

}
