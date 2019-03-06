package org.backend2.core.model;

import com.google.auto.value.AutoValue;

@AutoValue
public abstract class ModelProperty implements Model {
	@Override
	public ModelType type() {
		return ModelType.PROPERTY;
	}

	abstract PropertyType propertyType();

	abstract boolean virtual();

	@AutoValue.Builder
	abstract static class Builder extends Model.Builder<ModelProperty, Builder> {

		abstract Builder setPropertyType(PropertyType propertyType);

		abstract Builder setVirtual(boolean virtual);
	}

	static Builder builder() {
		return new AutoValue_ModelProperty.Builder() //
				.setVirtual(false);
	}

	abstract Builder toBuilder();

	@Override
	public ModelProperty clone() {
		return toBuilder().build();
	}
}
