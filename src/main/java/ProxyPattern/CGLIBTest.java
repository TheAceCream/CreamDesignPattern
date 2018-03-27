package ProxyPattern;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CGLIBTest {
    public void test(){
        System.out.println("hello world");
    }

    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(CGLIBTest.class);
        enhancer.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
                System.out.println("方法开始前执行！");
                Object result = proxy.invokeSuper(obj, args);
                System.out.println("方法开始后执行！");
                return result;
            }
        });
        CGLIBTest sample = (CGLIBTest) enhancer.create();
        sample.test();
    }
}
