package SingletonPattern;

/**
 * 静态内部类
 * 优点：加载时不会初始化静态变量INSTANCE，因为没有主动使用，达到懒加载
 * 静态内部类实现单例，
 * 一是解决了懒加载线程安全问题（类加载的三个步骤加载、链接、初始化，即调用类构造函数<clinit>()初始化时JVM会自动同步）
 * 和获取单例时的判断问题；二是解决了饿汉式和枚举在加载时无论是否使用就分配内存的问题；
 * 三是可以和懒加载、饿汉式一样通过在私有构造中判断单例是否为null来进行非法构造方法反射的控制。
 */
public class InternalSingleton {

    private static class SingletonHolder{
        private final static InternalSingleton SINGLETON = new InternalSingleton();
    }

    private InternalSingleton(){

    }

    public static InternalSingleton getSingleton(){
        return SingletonHolder.SINGLETON;
    }

}
