package ProxyPattern;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamicProxy implements InvocationHandler {

    //被代理的对象
    Object targetObject;

    /**
     * 获得被代理后的对象
     * @param object 被代理
     * @return  代理后
     */
    public Object getProxyObject(Object object){
        this.targetObject = object;
        return Proxy.newProxyInstance(
                //类加载器
                targetObject.getClass().getClassLoader(),
                //被代理对象的所有接口
                targetObject.getClass().getInterfaces(),
                //InvocationHandler 表示调用方法的时候关联到这个InvocationHandler对象上，invoke()执行
                this
                );
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //之前执行
        System.out.println("执行在前面！！！");
        //通过反射调用方法,并传参
        Object result=method.invoke(targetObject, args);
        System.out.println("执行在后面！！！");
        return result;
    }

}
