package org.backend2.core.prop;

import org.backend2.core.DataSetter;

public class IntegerProp extends AbstractProp<Integer> {

	public IntegerProp(DataSetter<?> setter, int columnIndex) {
		super(setter, columnIndex);
	}

	@Override
	public Integer getValue() {
		return setter.getInteger(columnIndex);
	}

	@Override
	public void setValue(Integer value) {
		setter.setInteger(columnIndex, value);
	}

}
