package org.backend2.core.model;

import java.util.Set;

import com.google.auto.value.AutoValue;
import com.google.common.collect.ImmutableSet;

@AutoValue
public abstract class ModelEntity implements Model {
	@Override
	public ModelType type() {
		return ModelType.ENTITY;
	}

	abstract ModelTable table();

	public abstract ImmutableSet<ModelProperty> properties();

	abstract boolean virtual();

	@AutoValue.Builder
	abstract static class Builder extends Model.Builder<ModelEntity, Builder> {

		abstract Builder setTable(ModelTable table);

		abstract Builder setProperties(Set<ModelProperty> properties);

		abstract Builder setVirtual(boolean virtual);
	}

	static Builder builder() {
		return new AutoValue_ModelEntity.Builder() //
				.setVirtual(false);
	}

	abstract Builder toBuilder();

	@Override
	public ModelEntity clone() {
		return toBuilder().build();
	}
}
