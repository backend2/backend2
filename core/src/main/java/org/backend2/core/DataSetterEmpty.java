package org.backend2.core;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

public class DataSetterEmpty<D> implements DataSetter<D> {
	
	private final D data;
	
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
	public void setInteger(int columnIndex, Integer value) {
		invalidSet(columnIndex, Integer.class.getName(), value);
	}

	@Override
	public void setByte(int columnIndex, Byte value) {
		invalidSet(columnIndex, Byte.class.getName(), value);
	}

	@Override
	public void setCharacter(int columnIndex, Character value) {
		invalidSet(columnIndex, Character.class.getName(), value);
	}

	@Override
	public void setBoolean(int columnIndex, Boolean value) {
		invalidSet(columnIndex, Boolean.class.getName(), value);
	}

	@Override
	public void setShort(int columnIndex, Short value) {
		invalidSet(columnIndex, Short.class.getName(), value);
	}

	@Override
	public void setLong(int columnIndex, Long value) {
		invalidSet(columnIndex, Long.class.getName(), value);
	}

	@Override
	public void setFloat(int columnIndex, Float value) {
		invalidSet(columnIndex, Float.class.getName(), value);
	}

	@Override
	public void setDouble(int columnIndex, Double value) {
		invalidSet(columnIndex, Double.class.getName(), value);
	}

	@Override
	public void setBigDecimal(int columnIndex, BigDecimal value) {
		invalidSet(columnIndex, BigDecimal.class.getName(), value);
	}

	@Override
	public void setDate(int columnIndex, Date value) {
		invalidSet(columnIndex, Date.class.getName(), value);
	}

	@Override
	public void setTime(int columnIndex, Time value) {
		invalidSet(columnIndex, Time.class.getName(), value);
	}

	@Override
	public void setTimestamp(int columnIndex, Timestamp value) {
		invalidSet(columnIndex, Timestamp.class.getName(), value);
	}

	

	@Override
	public Integer getInteger(int columnIndex) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Byte getByte(int columnIndex) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Character getCharacter(int columnIndex) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean getBoolean(int columnIndex) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Short getShort(int columnIndex) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long getLong(int columnIndex) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Float getFloat(int columnIndex) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Double getDouble(int columnIndex) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BigDecimal getBigDecimal(int columnIndex) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Date getDate(int columnIndex) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Time getTime(int columnIndex) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Timestamp getTimestamp(int columnIndex) {
		// TODO Auto-generated method stub
		return null;
	}

}
