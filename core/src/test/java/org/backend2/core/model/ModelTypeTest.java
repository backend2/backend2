package org.backend2.core.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runners.Suite.SuiteClasses;
import org.junit.runners.model.InitializationError;

public class ModelTypeTest {
	private static Class<?>[] getAnnotatedClasses() throws InitializationError {
		Class<?> klass = ModelTestSuite.class;
		SuiteClasses annotation = klass.getAnnotation(SuiteClasses.class);
		if (annotation == null) {
			throw new InitializationError(
					String.format("class '%s' must have a SuiteClasses annotation", klass.getName()));
		}
		return annotation.value();
	}

	/**
	 * Test to see if all ModelType enum has appropriate test case in ModelTestSuite
	 */
	@Test
	public void testAllModelTypes() throws Exception {
		Class<?>[] tests = getAnnotatedClasses();
		assertTrue("We don't have tests in ModelTestSuite!", tests.length > 0);
		Map<ModelType, ModelType> modelTypeMap = new HashMap<>();
		for (ModelType t : ModelType.values()) {
			modelTypeMap.put(t, t);
		}
		for (Class<?> c : tests) {
			Object o = c.newInstance();
			if (o instanceof ModelTest) {
				ModelTest md = (ModelTest) o;
				md.setup();
				if (!modelTypeMap.containsKey(md.type())) {
					fail("We don't have ModelType enum " + md.type());
				}
				modelTypeMap.remove(md.type());
			}
		}
		if (modelTypeMap.size() > 0) {
			for (ModelType t : modelTypeMap.values()) {
				fail("We don't have test case for ModelType enum (" + t + ")");
			}
		}
	}

	@Test
	public void testModelTestSuiteOrder() throws Exception {		
		List<Class<?>> tests = Arrays.asList(getAnnotatedClasses());
		Collections.sort(tests, new Comparator<Class<?>>() {
			@Override
			public int compare(Class<?> o1, Class<?> o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});
		int i = 0;
		for (Class<?> t : getAnnotatedClasses()) {
			Class<?> o = tests.get(i++);
			assertEquals("Ïnvalid test order: " + o + " <> " + t, o.getName(), t.getName());
		}
	}

	@Test
	public void testModelTypeOrder() throws Exception {
		List<ModelType> types = Arrays.asList(ModelType.values());
		Collections.sort(types, new Comparator<ModelType>() {
			@Override
			public int compare(ModelType o1, ModelType o2) {
				return o1.toString().toLowerCase().compareTo(o2.toString().toLowerCase());
			}
		});
		int i = 0;
		for (ModelType t : ModelType.values()) {
			ModelType o = types.get(i++);
			assertEquals("Ïnvalid ModelType order: " + o + " <> " + t, o, t);
		}
	}
}
