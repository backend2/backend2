package org.backend2.core.model;

import com.google.auto.value.AutoValue;

@AutoValue
public abstract class ModelIndex implements Model {
	@Override
	public ModelType type() {
		return ModelType.INDEX;
	}

	@AutoValue.Builder
	abstract static class Builder extends Model.Builder<ModelIndex, Builder> {
	}

	static Builder builder() {
		return new AutoValue_ModelIndex.Builder();
	}

	abstract Builder toBuilder();

	@Override
	public ModelIndex clone() {
		return toBuilder().build();
	}
}
