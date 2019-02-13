package org.backend2.core;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

public class DataSetterEmpty<D> implements DataSetter<D> {

	protected final D data;

	public DataSetterEmpty(D data) {
		this.data = data;
	}

	public D data() {
		return data;
	}

	private void invalidSet(int columnIndex, String type, Object value) {
		throw new RuntimeException("Invalid set for columnIndex=" + columnIndex //
				+ " type=" + type + " value=" + value //
				+ " over " + data.getClass().getSimpleName());
	}

	private void invalidGet(int columnIndex, String type) {
		throw new RuntimeException("Invalid get for columnIndex=" + columnIndex //
				+ " type=" + type //
				+ " over " + data.getClass().getSimpleName());
	}

	@Override
	public String getString(int columnIndex) {
		invalidGet(columnIndex, String.class.getName());
		return null;
	}

	@Override
	public void setString(int columnIndex, String value) {
		invalidSet(columnIndex, String.class.getName(), value);
	}

	@Override
	public Integer getInteger(int columnIndex) {
		invalidGet(columnIndex, Integer.class.getName());
		return null;
	}

	@Override
	public void setInteger(int columnIndex, Integer value) {
		invalidSet(columnIndex, Integer.class.getName(), value);
	}

	@Override
	public int getInt(int columnIndex) {
		invalidGet(columnIndex, "int");
		return 0;
	}

	@Override
	public void setInt(int columnIndex, int value) {
		invalidSet(columnIndex, "int", value);
	}

	@Override
	public Byte getByte(int columnIndex) {
		invalidGet(columnIndex, Byte.class.getName());
		return null;
	}

	@Override
	public void setByte(int columnIndex, Byte value) {
		invalidSet(columnIndex, Byte.class.getName(), value);
	}

	@Override
	public Character getCharacter(int columnIndex) {
		invalidGet(columnIndex, Character.class.getName());
		return null;
	}

	@Override
	public void setCharacter(int columnIndex, Character value) {
		invalidSet(columnIndex, Character.class.getName(), value);
	}

	@Override
	public Boolean getBoolean(int columnIndex) {
		invalidGet(columnIndex, Boolean.class.getName());
		return null;
	}

	@Override
	public void setBoolean(int columnIndex, Boolean value) {
		invalidSet(columnIndex, Boolean.class.getName(), value);
	}
	
	@Override
	public boolean getBooleanPrim(int columnIndex) {
		invalidGet(columnIndex, "boolean");
		return false;
	}

	@Override
	public void setBooleanPrim(int columnIndex, boolean value) {
		invalidSet(columnIndex, "boolean", value);
	}

	@Override
	public Short getShort(int columnIndex) {
		invalidGet(columnIndex, Short.class.getName());
		return null;
	}

	@Override
	public void setShort(int columnIndex, Short value) {
		invalidSet(columnIndex, Short.class.getName(), value);
	}

	@Override
	public Long getLong(int columnIndex) {
		invalidGet(columnIndex, Long.class.getName());
		return null;
	}

	@Override
	public void setLong(int columnIndex, Long value) {
		invalidSet(columnIndex, Long.class.getName(), value);
	}

	@Override
	public Float getFloat(int columnIndex) {
		invalidGet(columnIndex, Float.class.getName());
		return null;
	}

	@Override
	public void setFloat(int columnIndex, Float value) {
		invalidSet(columnIndex, Float.class.getName(), value);
	}

	@Override
	public Double getDouble(int columnIndex) {
		invalidGet(columnIndex, Double.class.getName());
		return null;
	}

	@Override
	public void setDouble(int columnIndex, Double value) {
		invalidSet(columnIndex, Double.class.getName(), value);
	}

	@Override
	public BigDecimal getBigDecimal(int columnIndex) {
		invalidGet(columnIndex, BigDecimal.class.getName());
		return null;
	}

	@Override
	public void setBigDecimal(int columnIndex, BigDecimal value) {
		invalidSet(columnIndex, BigDecimal.class.getName(), value);
	}

	@Override
	public Date getDate(int columnIndex) {
		invalidGet(columnIndex, Date.class.getName());
		return null;
	}

	@Override
	public void setDate(int columnIndex, Date value) {
		invalidSet(columnIndex, Date.class.getName(), value);
	}

	@Override
	public Time getTime(int columnIndex) {
		invalidGet(columnIndex, Time.class.getName());
		return null;
	}

	@Override
	public void setTime(int columnIndex, Time value) {
		invalidSet(columnIndex, Time.class.getName(), value);
	}

	@Override
	public Timestamp getTimestamp(int columnIndex) {
		invalidGet(columnIndex, Timestamp.class.getName());
		return null;
	}

	@Override
	public void setTimestamp(int columnIndex, Timestamp value) {
		invalidSet(columnIndex, Timestamp.class.getName(), value);
	}

}
