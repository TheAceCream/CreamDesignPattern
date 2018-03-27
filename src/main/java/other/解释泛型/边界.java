package other.解释泛型;

/**
 * Created by AceCream on 2018/3/9.
 */
public class 边界 {
    //比如说我们想要统计：一个泛型数组中大于某个特定元素的个数
    //我们可以写个方法
//    public static <T> int count(T[] array,T elem){
//        int count = 0;
//        for (T temp:array){
//            if (temp>elem){
//                count++;
//            }
//        }
//        return count;
//    }

    //！！！为什么上面的代码报错！！！

    public static <T extends Comparable<T>> int count(T[] array,T elem){
        int count= 0;
        for (T temp : array) {
            //解释一下，这个是比较器的方法，可以直观理解一下：
            /**
             * 比较temp和elem相等：返回 0
             * temp>elem ：返回 1
             * temp<elem ：返回 -1
             */
            if (temp.compareTo(elem)>0){
                count++;
            }
        }
        return count;
    }


}
