package SingletonPattern;

/**
 * 利用枚举
 * 优点：不仅能避免多线程同步问题，而且还能防止反序列化重新创建新的对象
 * 推荐！
 */
public enum EnumSingleton {

    SINGLETON;

    public void getSingleyon(){

    }

}
