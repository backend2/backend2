package org.backend2.core.model;

import com.google.auto.value.AutoValue;

@AutoValue
public abstract class ModelSequence implements Model {
	@Override
	public ModelType type() {
		return ModelType.SEQUENCE;
	}

	abstract long start();

	abstract long increment();

	@AutoValue.Builder
	abstract static class Builder extends Model.Builder<ModelSequence, Builder> {
		abstract Builder setStart(long start);

		abstract Builder setIncrement(long increment);
	}

	static Builder builder() {
		return new AutoValue_ModelSequence.Builder() //
				.setStart(1) //
				.setIncrement(1);
	}

	abstract Builder toBuilder();

	@Override
	public ModelSequence clone() {
		return toBuilder().build();
	}
}
