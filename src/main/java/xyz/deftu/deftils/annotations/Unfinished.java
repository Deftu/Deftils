package xyz.deftu.deftils.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Indicates that this element is unfinished and should <b>NOT</b> be used unless specified otherwise.
 * This feature could potentially be removed or drastically modified, it <b>should not be used in any way</b> until this annotation has been removed.
 */
@Retention(RetentionPolicy.CLASS)
@Target({
        ElementType.CONSTRUCTOR,
        ElementType.METHOD,
        ElementType.TYPE
})
public @interface Unfinished {}