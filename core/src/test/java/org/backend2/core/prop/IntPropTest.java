package org.backend2.core.prop;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.backend2.core.DataSetterEmpty;
import org.junit.Test;

public class IntPropTest {

	private class Setter extends DataSetterEmpty<Void> {
		private int value;

		public Setter() {
			super(null);
		}

		@Override
		public int getInt(int columnIndex) {
			return value;
		}

		@Override
		public void setInt(int columnIndex, int value) {
			this.value = value;
		}

	};

	

	@Test
	public void testSetValNullValueZero() {
		IntProp p = new IntProp(new Setter(), 1);
		// default is null
		assertNull(p.getValue());
		assertEquals(0, p.get());
		// set 0
		p.set(0);
		assertNull(p.getValue());
		assertEquals(0, p.get());
		// set 1
		p.set(1);
		assertEquals(Integer.valueOf(1), p.getValue());
		assertEquals(1, p.get());
		// setValue null
		p.setValue(null);
		assertNull(p.getValue());
		assertEquals(0, p.get());
		// setValue 2
		p.setValue(Integer.valueOf(2));
		assertEquals(Integer.valueOf(2), p.getValue());
		assertEquals(2, p.get());
	}

	@Test
	public void testSetValNullValueMinusOne_AllowNullYes() {
		IntProp p = new IntProp(new Setter(), 1, true, -1);
		// default is 0
		assertEquals(Integer.valueOf(0), p.getValue());
		assertEquals(0, p.get());
		// set 0
		p.set(0);
		assertEquals(Integer.valueOf(0), p.getValue());
		assertEquals(0, p.get());
		// set -1
		p.set(-1);
		assertNull(p.getValue());
		assertEquals(-1, p.get());
		// set 1
		p.set(1);
		assertEquals(Integer.valueOf(1), p.getValue());
		assertEquals(1, p.get());
		// setValue null
		p.setValue(null);
		assertNull(p.getValue());
		assertEquals(-1, p.get());
		// setValue 2
		p.setValue(Integer.valueOf(2));
		assertEquals(Integer.valueOf(2), p.getValue());
		assertEquals(2, p.get());
	}

	@Test
	public void testSetValNullValueMinusOne_AllowNullNo() {		
		IntProp p = new IntProp(new Setter(), 1, false, -1);
		// default is 0
		assertEquals(Integer.valueOf(0), p.getValue());
		assertEquals(0, p.get());
		// set 0
		p.set(0);
		assertEquals(Integer.valueOf(0), p.getValue());
		assertEquals(0, p.get());
		// set -1
		p.set(-1);
		assertEquals(Integer.valueOf(-1), p.getValue());
		assertEquals(-1, p.get());
		// set 1
		p.set(1);
		assertEquals(Integer.valueOf(1), p.getValue());
		assertEquals(1, p.get());
		// setValue null
		p.setValue(null);
		assertEquals(Integer.valueOf(-1), p.getValue());
		assertEquals(-1, p.get());
		// setValue 2
		p.setValue(Integer.valueOf(2));
		assertEquals(Integer.valueOf(2), p.getValue());
		assertEquals(2, p.get());
	}

	public void testSql() throws SQLException {
		ResultSet rs = null;
		rs.getString(1);
	}
}
