package ProxyPattern;

public class Test {


    public static void main(String[] args) {
        //通过getProxyObject方法获得被代理后的对象
        IMaths math=(IMaths)new DynamicProxy().getProxyObject(new Maths());
        math.add(1,2);
    }

}
