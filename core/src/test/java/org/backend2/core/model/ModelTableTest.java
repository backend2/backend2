package org.backend2.core.model;

import java.util.Collections;

public class ModelTableTest extends ModelTest {

	@Override
	public void setup() {
		model = ModelTable.builder()//
				.setName("person")//
				.setParent(PARENT)//
				.setColumns(Collections.singleton(ModelColumnTest.COLUMN))//
				.build();
	}

	@Override
	public ModelType type() {
		return ModelType.TABLE;
	}

}
