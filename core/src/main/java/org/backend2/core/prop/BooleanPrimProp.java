package org.backend2.core.prop;

import org.backend2.core.DataSetter;

public class BooleanPrimProp extends AbstractProp<Boolean> {

	private final boolean allowNull;
	private final boolean nullValue;

	public BooleanPrimProp(DataSetter<?> setter, int columnIndex) {
		this(setter, columnIndex, false, false);
	}

	public BooleanPrimProp(DataSetter<?> setter, int columnIndex, boolean allowNull, boolean nullValue) {
		super(setter, columnIndex);
		this.allowNull = allowNull;
		this.nullValue = nullValue;
	}

	@Override
	public Boolean getValue() {
		boolean val = setter.getBooleanPrim(columnIndex);
		return allowNull && val == nullValue ? null : Boolean.valueOf(val);
	}

	@Override
	public void setValue(Boolean value) {
		setter.setBooleanPrim(columnIndex, value == null ? nullValue : value.booleanValue());
	}

	public boolean get() {
		return setter.getBooleanPrim(columnIndex);
	}

	public void set(boolean val) {
		setter.setBooleanPrim(columnIndex, val);
	}
}
