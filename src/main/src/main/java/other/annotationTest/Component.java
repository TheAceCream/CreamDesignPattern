package other.annotationTest;

import java.lang.annotation.*;

/**
 * Created by AceCream on 2018/3/21.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface Component {

    String identifier() default "";
}
