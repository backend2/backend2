package org.backend2.core;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

public interface DataSetter<D> {
	public D data();

	// String
	public String getString(int columnIndex);
	public void setString(int columnIndex, String value);
	
	// Integer
	public Integer getInteger(int columnIndex);
	public void setInteger(int columnIndex, Integer value);
	
	// Byte
	public Byte getByte(int columnIndex);
	public void setByte(int columnIndex, Byte value);
	
	// Character
	public Character getCharacter(int columnIndex);
	public void setCharacter(int columnIndex, Character value);
	
	// Boolean
	public Boolean getBoolean(int columnIndex);
	public void setBoolean(int columnIndex, Boolean value);
	
	// Short
	public Short getShort(int columnIndex);
	public void setShort(int columnIndex, Short value);
	
	// Long
	public Long getLong(int columnIndex);
	public void setLong(int columnIndex, Long value);
	
	// Float
	public Float getFloat(int columnIndex);
	public void setFloat(int columnIndex, Float value);
	
	// Double
	public Double getDouble(int columnIndex);
	public void setDouble(int columnIndex, Double value);
	
	// BigDecimal
	public BigDecimal getBigDecimal(int columnIndex);
	public void setBigDecimal(int columnIndex, BigDecimal value);
	
	// Date
	public Date getDate(int columnIndex);
	public void setDate(int columnIndex, Date value);
	
	// Time
	public Time getTime(int columnIndex);
	public void setTime(int columnIndex, Time value);
	
	// Timestamp
	public Timestamp getTimestamp(int columnIndex);
	public void setTimestamp(int columnIndex, Timestamp value);
	
}
