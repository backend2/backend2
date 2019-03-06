package org.backend2.core.model;

public class ModelPropertyTest extends ModelTest {

	public static final ModelProperty PROPERTY = ModelProperty.builder() //
			.setName("property1") //
			.setPropertyType(PropertyType.VALUE) //
			.build();

	@Override
	public void setup() {
		model = ModelProperty.builder() //
				.setName("property1") //
				.setPropertyType(PropertyType.VALUE) //
				.build();
	}

	@Override
	public ModelType type() {
		return ModelType.PROPERTY;
	}
}
