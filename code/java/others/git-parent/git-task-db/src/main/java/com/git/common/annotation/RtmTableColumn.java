package com.git.common.annotation;

/**
 * Created by wx:LittleB726  on 2019/12/05.
 */

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.PARAMETER})
public @interface RtmTableColumn {

    String value() default "";
}
