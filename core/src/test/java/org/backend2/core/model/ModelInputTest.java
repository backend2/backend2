package org.backend2.core.model;

import java.util.Collections;

public class ModelInputTest extends ModelTest {

	@Override
	public void setup() {
		model = ModelInput.builder() //
				.setName("input1") //
				.setLabel("input one") //
				.setElement(ElementType.TEXT) //
				.setBody(Collections.emptySet()) //
				.build();
	}

	@Override
	public ModelType type() {
		return ModelType.INPUT;
	}
}
