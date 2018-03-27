package ProxyPattern;

public class Maths implements IMaths{

    @Override
    public int add(int a, int b) {
        System.out.println("加法执行");
        return a+b;
    }

    @Override
    public int del(int a, int b) {
        System.out.println("减法执行");
        return a-b;
    }

    @Override
    public int mut(int a, int b) {
        System.out.println("乘法执行");
        return a*b;
    }

    @Override
    public int div(int a, int b) {
        System.out.println("除法执行");
        return a/b;
    }
}
