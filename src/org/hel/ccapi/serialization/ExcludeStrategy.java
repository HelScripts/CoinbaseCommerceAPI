package org.hel.ccapi.serialization;

import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;

public class ExcludeStrategy implements ExclusionStrategy {

    @Override
    public boolean shouldSkipField(FieldAttributes fieldAttributes) {
        return fieldAttributes.getAnnotation(Exclude.class) != null;
    }

    @Override
    public boolean shouldSkipClass(Class<?> aClass) {
        return false;
    }
}
