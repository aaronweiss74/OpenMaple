package openmaple.net.common.annotate;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * An annotation that denotes a parameter or field as being unsigned.
 *
 * @author Aaron Weiss
 * @version 1.0.0
 * @since 2/10/14
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.PARAMETER, ElementType.FIELD})
public @interface Unsigned {
}
