package org.backend2.core.model;

public class ModelSchemaTest extends ModelTest {

	@Override
	public void setup() {
		model = ModelSchema.builder() //
				.setName("main") //
				.setParent(PARENT) //
				.setIsDefault(true) //
				.setTenant(false) //
				.build();
	}

	@Override
	public ModelType type() {
		return ModelType.SCHEMA;
	}
}
