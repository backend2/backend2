package org.backend2.core.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public abstract class ModelTest {
	protected Model model;

	@Before
	public abstract void setup();

	public abstract ModelType type();

	@Test
	public void testClassName() {
		// System.out.println(model.getClass().getSimpleName());
		String simpleName = model.getClass().getSimpleName();
		assertTrue(simpleName.startsWith("Model") || simpleName.startsWith("AutoValue_Model"));
		String typeName = ("Model" + model.type()).toLowerCase();
		// Class model name in sync with type property
		assertTrue(simpleName.toLowerCase().endsWith(typeName));
		// this test
		assertEquals(typeName + "test", getClass().getSimpleName().toLowerCase());
	}

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
