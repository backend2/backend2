package org.backend2.core.model;

public class ModelAppTest extends ModelTest {

	@Override
	public void setup() {
		model = ModelApp.builder() //
				.setName("name") //
				.build();
	}

	@Override
	public ModelType type() {
		return ModelType.APP;
	}
}
