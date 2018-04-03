package other.解释泛型;

/**
 * Created by AceCream on 2018/3/9.
 *
 * 泛型类！
 *
 */
public class TestBox {
    //我的这个box中只能装String类型！并不灵活！
    private String something;

    public String getSomething() {
        return something;
    }

    public void setSomething(String something) {
        this.something = something;
    }
}

class TestBox2<T>{
    //这样的话，在初始化的阶段，即可决定我这个类里面装什么类型！
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public static void main(String[] args) {
        TestBox2<Integer> integerTestBox2 = new TestBox2<>();
        integerTestBox2.setT(1);
        System.out.println(integerTestBox2.getT());
        TestBox2<String> stringTestBox2 = new TestBox2<>();
        stringTestBox2.setT("str");
        System.out.println(stringTestBox2.getT());

        //这里有个通配符问题，这个泛型支持了Integer和Double 。。。Why？我们也试一下！
        Integer i = new Integer(1);
        Double d = new Double(1.00);
        TestBox2<Number> testBox3 = new TestBox2<>();
        testBox3.setT(i);
        testBox3.setT(d);

    }


}
