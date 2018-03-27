package SingletonPattern;

/**
 * 懒汉式
 * 最常用写法
 * 缺点：线程不安全
 */
public class LazySingleton {

    private static LazySingleton singleton;

    private LazySingleton(){

    }

    public static LazySingleton getSingle(){
        if (singleton==null){
            singleton = new LazySingleton();
        }
        return singleton;
    }

}
