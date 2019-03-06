package org.backend2.core.model;

public class ModelIndexTest extends ModelTest {
	@Override
	public void setup() {
		model = ModelIndex.builder() //
				.setName("index1") //				
				.build();
	}

	@Override
	public ModelType type() {
		return ModelType.INDEX;
	}
}
