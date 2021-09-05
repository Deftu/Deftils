package xyz.deftu.mango.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Indicates that an element is in beta, and can potentially be removed. It's <b>generally</b> safe for <b>applications</b>
 * to use this features labelled with this annotation, but it's <b>unsafe</b> for <b>libraries</b> to use these features, as
 * they cannot be modified by the developer.
 */
@Retention(RetentionPolicy.CLASS)
@Target({
        ElementType.ANNOTATION_TYPE,
        ElementType.CONSTRUCTOR,
        ElementType.FIELD,
        ElementType.METHOD,
        ElementType.TYPE
})
public @interface Beta {}