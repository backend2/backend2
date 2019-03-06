package org.backend2.core.model;

import java.util.Set;

import com.google.auto.value.AutoValue;

@AutoValue
public abstract class ModelForm implements Model, FormElement {
	
	private Model myParent;
	
	public Model myParent() {
		return myParent;
	}
	
	
	@Override
	public ModelType type() {
		return ModelType.FORM;
	}

	@AutoValue.Builder
	abstract static class Builder extends Model.Builder<ModelForm, Builder> {
		public abstract Builder setLabel(String label);

		public abstract Builder setElement(ElementType element);

		public abstract Builder setBody(Set<FormElement> body);
	}
	
	static Builder builder() {
		return new AutoValue_ModelForm.Builder();
	}

	abstract Builder toBuilder();

	@Override
	public ModelForm clone() {
		return toBuilder().build();
	}
}
