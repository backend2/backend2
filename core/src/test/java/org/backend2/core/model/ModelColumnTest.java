package org.backend2.core.model;

public class ModelColumnTest extends ModelTest {

	public static final ModelColumn COLUMN = ModelColumn.builder() //
			.setName("price") //
			.setDataType(DataType.DECIMAL) //
			.setLength(14) //
			.setPrecision(12) //
			.setScale(2) //
			.build();

	@Override
	public void setup() {
		model = ModelColumn.builder() //
				.setName("name") //
				.setDataType(DataType.STRING) //
				.setLength(10) //
				.setPrecision(12) //
				.setScale(2) //
				.build();
	}

	@Override
	public ModelType type() {
		return ModelType.COLUMN;
	}
}
