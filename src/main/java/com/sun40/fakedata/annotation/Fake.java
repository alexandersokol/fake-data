package com.sun40.fakedata.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(value = ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Fake {

    interface Int {
        @Target(value = ElementType.FIELD)
        @Retention(RetentionPolicy.RUNTIME)
        @interface Range {
            int min() default Integer.MIN_VALUE;

            int max() default Integer.MAX_VALUE;
        }

        @Target(value = ElementType.FIELD)
        @Retention(RetentionPolicy.RUNTIME)
        @interface Exact {
            int value();
        }

        @Target(value = ElementType.FIELD)
        @Retention(RetentionPolicy.RUNTIME)
        @interface Positive {
        }

        @Target(value = ElementType.FIELD)
        @Retention(RetentionPolicy.RUNTIME)
        @interface Negative {
        }
    }

    @Target(value = ElementType.FIELD)
    @Retention(RetentionPolicy.RUNTIME)
    @interface Unique {
        String[] modifiers() default {};

        Class<?>[] value() default {};
    }

}
