package SingletonPattern;

/**
 * 饿汉
 * 缺点 ：没有懒加载效果
 */
public class HungrySingleton {

    private static HungrySingleton singleton = new HungrySingleton();

    private HungrySingleton(){

    }

    public static HungrySingleton getSingleton(){
        return singleton;
    }

}
