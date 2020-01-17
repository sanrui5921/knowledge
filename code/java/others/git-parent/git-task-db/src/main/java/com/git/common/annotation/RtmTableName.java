package com.git.common.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by wx:LittleB726  on 2019/12/05.
 */

@Retention(RetentionPolicy.RUNTIME)

@Target(value = {ElementType.FIELD, ElementType.TYPE})

public @interface RtmTableName {
    String value() default "";

    String[] insertExclude() default {};

    String[] updateKey() default {};

    String[] updateColumns() default {};
}
