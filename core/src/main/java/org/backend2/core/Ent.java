package org.backend2.core;

import java.util.Collection;

public interface Ent {

	public Collection<Prop<?>> properties();

	public Object getPropertyValue(String propertyName);

	public void setPropertyValue(String propertyName, Object value);
}
