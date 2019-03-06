package org.backend2.core.model;

import java.util.Set;

import com.google.auto.value.AutoValue;

@AutoValue
public abstract class ModelPanel implements Model, FormElement {
	@Override
	public ModelType type() {
		return ModelType.PANEL;
	}

	@AutoValue.Builder
	abstract static class Builder extends Model.Builder<ModelPanel, Builder> {
		public abstract Builder setLabel(String label);

		public abstract Builder setElement(ElementType element);

		public abstract Builder setBody(Set<FormElement> body);
	}

	static Builder builder() {
		return new AutoValue_ModelPanel.Builder();
	}

	abstract Builder toBuilder();

	@Override
	public ModelPanel clone() {
		return toBuilder().build();
	}
}
