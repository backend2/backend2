package org.backend2.core.model;

import java.util.Collections;

public class ModelFormTest extends ModelTest {

	@Override
	public void setup() {
		model = ModelForm.builder() //
				.setName("form1") //
				.setLabel("Form one") //
				.setElement(ElementType.FORM) //
				.setBody(Collections.emptySet()) //
				.build();
	}

	@Override
	public ModelType type() {
		return ModelType.FORM;
	}
}
