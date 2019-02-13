package org.backend2.core.prop;

import org.backend2.core.DataSetter;

public class IntProp extends AbstractProp<Integer> {

	private final int nullValue;
	private boolean allowNull;

	public IntProp(DataSetter<?> setter, int columnIndex) {
		this(setter, columnIndex, true, 0);
	}

	public IntProp(DataSetter<?> setter, int columnIndex, boolean allowNull, int nullValue) {
		super(setter, columnIndex);
		this.allowNull = allowNull;
		this.nullValue = nullValue;
	}

	@Override
	public Integer getValue() {
		int val = setter.getInt(columnIndex);
		return allowNull && val == nullValue ? null : Integer.valueOf(val);
	}

	@Override
	public void setValue(Integer value) {
		setter.setInt(columnIndex, value == null ? nullValue : value.intValue());
	}

	public int get() {
		return setter.getInt(columnIndex);
	}

	public void set(int val) {
		setter.setInt(columnIndex, val);
	}
}
