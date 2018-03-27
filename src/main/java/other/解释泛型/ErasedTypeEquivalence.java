package other.解释泛型;

import java.util.ArrayList;

/**
 * Created by AceCream on 2018/3/15.
 */
public class ErasedTypeEquivalence {
    public static void main(String[] args) {
        Class c1 = new ArrayList<String>().getClass();
        Class c2 = new ArrayList<Integer>().getClass();
        System.out.println(c1 == c2);
        //猜猜结果！
//      假设我们支持泛型数组的创建，由于运行时期类型信息已经被擦除，
//      JVM实际上根本就不知道new ArrayList<String>()和new ArrayList<Integer>()的区别。
//      类似这样的错误假如出现才实际的应用场景中，将非常难以察觉。

    }
}
