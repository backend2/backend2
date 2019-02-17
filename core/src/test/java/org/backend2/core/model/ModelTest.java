package org.backend2.core.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public abstract class ModelTest {
	protected Model model;
	public static final Model PARENT = new Model() {

		@Override
		public String name() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public ModelType type() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Model parent() {
			// TODO Auto-generated method stub
			return null;
		}

		public Model clone() {
			return this;
		}

	};

	@Before
	public abstract void setup();

	public abstract ModelType type();

	@Test
	public void testType() {
		assertEquals(type(), model.type());
		assertTrue(type() == model.type());
		assertNotNull(model.type());
	}

	@Test
	public void testClone() {
		Model clone = (Model) model.clone();
		assertEquals(model, clone);
		assertFalse(model == clone);
		//
		Model cloneOfClone = (Model) clone.clone();
		assertEquals(model, cloneOfClone);
		assertFalse(model == cloneOfClone);
		assertEquals(clone, cloneOfClone);
		assertFalse(clone == cloneOfClone);
	}
}
