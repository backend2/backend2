package org.backend2.core.model;

import com.google.auto.value.AutoValue;

@AutoValue
public abstract class ModelSchema implements Model {

	@Override
	public ModelType type() {
		return ModelType.SCHEMA;
	}
	
	abstract boolean isDefault();
	
	abstract boolean tenant();

	@AutoValue.Builder
	abstract static class Builder extends Model.Builder<ModelSchema, Builder> {		
		abstract Builder setIsDefault(boolean isDefault);
		abstract Builder setTenant(boolean tenant);
	}

	static Builder builder() {
		return new AutoValue_ModelSchema.Builder();
	}

	abstract Builder toBuilder();

	@Override
	public ModelSchema clone() {
		return toBuilder().build();
	}
}
