package other.解释泛型;

/**
 * Created by AceCream on 2018/3/15.
 * PECS
 */

class Fruit {}
class Apple extends Fruit {}

class Plate<T> {

    private T item;
    private Plate(T t){
        item=t;
    }

    public void set(T t){
        item=t;
    }


}
public class PECS {


}




//根据上面的例子，我们可以总结出一条规律，”Producer Extends, Consumer Super”：

//    "Producer Extends" – 如果你需要一个只读List，用它来produce T，那么使用   ? extends T。
//    "Consumer Super" – 如果你需要一个只写List，用它来consume T，那么使用     ? super T。
//        如果需要同时读取以及写入，那么我们就不能使用通配符了。

//请看源码Collection
