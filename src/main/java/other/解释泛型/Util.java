package other.解释泛型;

/**
 * Created by AceCream on 2018/3/9.
 * 解释一下泛型方法!
 */
public class Util {

//    声明一个泛型方法很简单，只要在返回类型前面加上一个类似<K, V>的形式就行 如下！
    public <K,V> boolean compair(SomeClass<K,V> t1,SomeClass<K,V> t2){
        return t1.getKey().equals(t2.getKey()) && t1.getValue().equals(t2.getValue());
    }

    public static void main(String[] args) {
        SomeClass<Integer,String> p1 = new SomeClass<>(1,"tom");
        SomeClass<Integer,String> p2 = new SomeClass<>(1,"tom");
        Util util = new Util();
        System.out.println(util.compair(p1,p2));
    }

}

class SomeClass<K,V>{

    private K key;
    private V value;

    public SomeClass(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}
