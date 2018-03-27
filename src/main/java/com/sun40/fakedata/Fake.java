package com.sun40.fakedata;

import java.lang.reflect.Field;

public class Fake {


    public static <T> T create(Class<T> claz) {
        if (claz == null) {
            throw new IllegalArgumentException("Parameter class should not be null!");
        }

        try {
            T instance = claz.newInstance();
            Field[] fields = claz.getDeclaredFields();
            for (Field field : fields) {
                if (field.getType() == int.class) {
                    field.setInt(instance, 10);
                }
            }
            return instance;
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        return null;
    }

}
