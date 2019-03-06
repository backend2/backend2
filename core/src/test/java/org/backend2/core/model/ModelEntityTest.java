package org.backend2.core.model;

import java.util.Collections;

public class ModelEntityTest extends ModelTest {
	@Override
	public void setup() {
		model = ModelEntity.builder() //
				.setName("entity1") //
				.setTable(ModelTableTest.TABLE) //
				.setProperties(Collections.singleton(ModelPropertyTest.PROPERTY)) //
				.build();
	}

	@Override
	public ModelType type() {
		return ModelType.ENTITY;
	}
}
