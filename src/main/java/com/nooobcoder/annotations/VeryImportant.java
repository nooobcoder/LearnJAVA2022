package com.nooobcoder.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * JavaDoc
 *
 * @author noobcoder
 * @version 1.0
 * @see java.lang.annotation.Annotation
 * @see java.lang.annotation.Retention
 * @see java.lang.annotation.Target
 * @see java.lang.annotation.ElementType
 * @see java.lang.annotation.RetentionPolicy
 * @since 1.0
 */
// @interface is necessary for creating a custom annotation
// @Target for classes
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface VeryImportant {

}
