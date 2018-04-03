package other.解释泛型;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by AceCream on 2018/3/9.
 */
public class Test1 {
    //为什么需要使用泛型？我自己理解最基本的是为集合内数据类型做约束，防止运行时异常！
    public static void main(String[] args) {
        List list1 = new ArrayList();
        list1.add(1);
        list1.add((byte)2);
        list1.add(true);
        list1.add('c');
        list1.add("str");
        list1.add(3L);
        list1.add(4.00);
        list1.add(5.1f);

        for (Object o : list1) {
            System.out.print(o+" ");
        }
        System.out.println();

        List<String> list2 = new ArrayList<>();
        list2.add("1");

    }


}
