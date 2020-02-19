package io.github.olucasfelix.methodinvocation;

import java.lang.reflect.InvocationTargetException;

public class AttributeSetter {

    public static void setObjectName(Object object, String name) {

        Class<?> clazz = object.getClass();
        try {
            var method = clazz.getMethod("setName", String.class);
            method.invoke(object, name);
        } catch (NoSuchMethodException e) {
            throw new IllegalArgumentException("class " + clazz.getName() + " does not support " +
                    "method setName(String)");
        } catch (IllegalAccessException e) {
            throw new IllegalArgumentException(
                    "Insufficient access permissions to call"
                            + " setName(:Name) in class " + clazz.getName());
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }
}
