package org.backend2.core.prop;

import org.backend2.core.Prop;

public abstract class IntProp implements Prop<Integer>{

	private final int nullValue;
	private boolean allowNull;
	
	public IntProp() {
		nullValue = 0;
		allowNull = true;
	}
	
    public IntProp(boolean allowNull, int nullValue) {
    	this.allowNull = allowNull;
		this.nullValue = nullValue;
	}
	
	@Override
	public Integer getValue() {
		int val = get();
		return allowNull && val == nullValue ? null : Integer.valueOf(val);
	}

	@Override
	public void setValue(Integer value) {
		set(value == null ? nullValue : value.intValue());
	}
	
	public abstract int get();
	
	public abstract void set(int val);

}
