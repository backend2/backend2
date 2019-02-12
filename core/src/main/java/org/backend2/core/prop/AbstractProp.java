package org.backend2.core.prop;

import org.backend2.core.DataSetter;
import org.backend2.core.Prop;

abstract class AbstractProp<V> implements Prop<V> {
    protected final DataSetter<?> setter;
    protected final int columnIndex;
    AbstractProp(DataSetter<?> setter, int columnIndex) {
    	this.setter=setter;
    	this.columnIndex = columnIndex;
    }
}
