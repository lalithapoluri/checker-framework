package org.checkerframework.checker.experimental.tainting_qual_poly.qual;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
public @interface MultiMethodTaintingParam {
    MethodTaintingParam[] value();
}
