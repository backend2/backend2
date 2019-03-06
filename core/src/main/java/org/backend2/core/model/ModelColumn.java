package org.backend2.core.model;

import com.google.auto.value.AutoValue;

@AutoValue
public abstract class ModelColumn implements Model {

	@Override
	public ModelType type() {
		return ModelType.COLUMN;
	}

	public abstract DataType dataType();

	public abstract int length();

	public abstract int precision();

	public abstract int scale();

	public abstract boolean primaryKey();

	@AutoValue.Builder
	public abstract static class Builder extends Model.Builder<ModelColumn, Builder> {

		public abstract Builder setDataType(DataType dataType);

		public abstract Builder setLength(int length);

		public abstract Builder setPrecision(int precision);

		public abstract Builder setScale(int scale);

		public abstract Builder setPrimaryKey(boolean primaryKey);
	}

	// TODO public?
	public static Builder builder() {
		return new AutoValue_ModelColumn.Builder()//
				.setPrimaryKey(false);
	}

	abstract Builder toBuilder();

	@Override
	public ModelColumn clone() {
		return toBuilder().build();
	}
}
