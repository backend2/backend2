package org.backend2.core.model;

import java.util.Collections;

public class ModelPanelTest extends ModelTest {

	@Override
	public void setup() {
		model = ModelPanel.builder() //
				.setName("panel1") //
				.setLabel("Panel one") //
				.setElement(ElementType.PANEL) //
				.setBody(Collections.emptySet()) //
				.build();
	}

	@Override
	public ModelType type() {
		return ModelType.PANEL;
	}

}
