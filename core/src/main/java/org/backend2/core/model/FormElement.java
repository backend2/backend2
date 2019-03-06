package org.backend2.core.model;

import com.google.common.collect.ImmutableSet;

public interface FormElement {
	public String name();

	public String label();

	public ElementType element();

	public ImmutableSet<FormElement> body();
}
