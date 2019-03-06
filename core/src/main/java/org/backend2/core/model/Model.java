package org.backend2.core.model;

import org.checkerframework.checker.nullness.qual.Nullable;

public interface Model extends Cloneable {
	public String name();

	public ModelType type();

	@Nullable
	public Model parent();

	static abstract class Builder<M, B> {
		public abstract B setName(String name);

		public abstract B setParent(@Nullable Model parent);

		public abstract M build();
	}

	public Model clone();
}
