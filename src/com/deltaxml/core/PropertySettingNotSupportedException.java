package com.deltaxml.core;

/**
 * @see <a href="http://docs.deltaxml.com/core/current/docs/api/com/deltaxml/core/PropertySettingNotSupportedException.html">
 * Class PropertySettingNotSupportedException</a>
 */
public class PropertySettingNotSupportedException extends PipelinedComparatorException {

    public PropertySettingNotSupportedException(String message, Throwable e, String propertyName, Class<?> suppliedClass, Class<?> requiredClass) {
        super(message, e);
        throw new UnsupportedOperationException();
    }

    public PropertySettingNotSupportedException(String message, String propertyName, Class<?> suppliedClass) {
        super(message);
        throw new UnsupportedOperationException();
    }

    public PropertySettingNotSupportedException(String message, String propertyName, Class<?> suppliedClass, Class<?> requiredClass) {
        super(message);
        throw new UnsupportedOperationException();
    }

    public PropertySettingNotSupportedException(Throwable e, String propertyName, Class<?> suppliedClass, Class<?> requiredClass) {
        super(e);
        throw new UnsupportedOperationException();
    }

    public Class<?> getSuppliedClass() {
        throw new UnsupportedOperationException();
    }

    public Class<?> getRequiredClass() {
        throw new UnsupportedOperationException();
    }

    public String getPropertyName() {
        throw new UnsupportedOperationException();
    }

}
