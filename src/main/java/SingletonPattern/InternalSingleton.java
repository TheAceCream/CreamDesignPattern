package SingletonPattern;

/**
 * 静态内部类
 * 优点：加载时不会初始化静态变量INSTANCE，因为没有主动使用，达到懒加载
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
