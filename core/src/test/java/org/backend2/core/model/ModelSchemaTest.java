package org.backend2.core.model;

public class ModelSchemaTest extends ModelTest {

	public static final ModelSchema PUBLIC = ModelSchema.builder() //
			.setName("public") //
			.setIsDefault(true) //
			.setTenant(false) //
			.build();

	@Override
	public void setup() {
		model = ModelSchema.builder() //
				.setName("main") //
				.build();
	}

	@Override
	public ModelType type() {
		return ModelType.SCHEMA;
	}
}
