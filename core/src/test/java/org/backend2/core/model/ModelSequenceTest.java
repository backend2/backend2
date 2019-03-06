package org.backend2.core.model;

public class ModelSequenceTest extends ModelTest {

	public static final ModelSequence SEQUENCE = ModelSequence.builder() //
			.setName("main_app_sq") //
			.build();

	@Override
	public void setup() {
		model = ModelSequence.builder()//
				.setName("main_sq")//
				.build();
	}

	@Override
	public ModelType type() {
		return ModelType.SEQUENCE;
	}
}
