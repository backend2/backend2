package org.backend2.core.model;

import com.google.auto.value.AutoValue;

@AutoValue
public abstract class ModelColumn implements Model {

	@Override
	public ModelType type() {
		return ModelType.COLUMN;
	}

	abstract DataType dataType();

	abstract int length();

	abstract int precision();

	abstract int scale();

	abstract boolean primaryKey();

	@AutoValue.Builder
	abstract static class Builder extends Model.Builder<ModelColumn, Builder> {

		abstract Builder setDataType(DataType dataType);

		abstract Builder setLength(int length);

		abstract Builder setPrecision(int precision);

		abstract Builder setScale(int scale);

		abstract Builder setPrimaryKey(boolean primaryKey);
	}

	static Builder builder() {
		return new AutoValue_ModelColumn.Builder()//
				.setPrimaryKey(false);
	}

	abstract Builder toBuilder();

	@Override
	public ModelColumn clone() {
		return toBuilder().build();
	}
}
