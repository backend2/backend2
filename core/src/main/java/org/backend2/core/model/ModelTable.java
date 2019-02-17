package org.backend2.core.model;

import java.util.Set;

import com.google.auto.value.AutoValue;
import com.google.common.collect.ImmutableSet;

@AutoValue
public abstract class ModelTable implements Model {
	@Override
	public ModelType type() {
		return ModelType.TABLE;
	}

	public abstract ImmutableSet<ModelColumn> columns();

	@AutoValue.Builder
	abstract static class Builder extends Model.Builder<ModelTable, Builder> {
		abstract Builder setColumns(Set<ModelColumn> columns);
	}

	static Builder builder() {
		return new AutoValue_ModelTable.Builder();
	}

	abstract Builder toBuilder();

	@Override
	public ModelTable clone() {
		return toBuilder().build();
	}
}
