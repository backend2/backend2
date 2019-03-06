package org.backend2.core.model;

import java.util.Collections;

public class ModelLabelTest extends ModelTest {

	@Override
	public void setup() {
		model = ModelLabel.builder() //
				.setName("label1") //
				.setLabel("Label one") //
				.setElement(ElementType.LABEL) //
				.setBody(Collections.emptySet()) //
				.build();
	}

	@Override
	public ModelType type() {
		return ModelType.LABEL;
	}

}
