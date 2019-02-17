package org.backend2.core.model;

public interface Model extends Cloneable {
	public String name();

	public ModelType type();

	public Model parent();

	static abstract class Builder<M, B> {
		abstract B setName(String name);

		abstract B setParent(Model parent);

		abstract M build();
	}

	public Model clone();
}
