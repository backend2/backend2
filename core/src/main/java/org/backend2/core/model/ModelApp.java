package org.backend2.core.model;

import com.google.auto.value.AutoValue;

@AutoValue
public abstract class ModelApp implements Model {

	@Override
	public ModelType type() {
		return ModelType.APP;
	}
	
	@AutoValue.Builder
	abstract static class Builder extends Model.Builder<ModelApp, Builder> {		
	}
	
	static Builder builder() {
		return new AutoValue_ModelApp.Builder();
	}
	
	abstract Builder toBuilder();

	@Override
	public ModelApp clone() {
		return toBuilder().build();
	}
}
