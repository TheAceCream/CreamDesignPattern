package SingletonPattern;

import java.util.Vector;

/**
 * 双重校验锁
 * 限制同步代码量。然而，由于一些不太常见的 Java 内存模型细节的原因，并不能保证这个双重检查锁定习语有效。
 * 偶尔会失败，而不是总失败。
 */
public class LockSingleton {

    private volatile static LockSingleton instance; //声明成 volatile
    private LockSingleton (){}

    public static LockSingleton getInstance(){
        //当instance为null的时候，两个线程可以并发进入if语句内部
        // 一个线程进入synchronized块去初始化实例instance，这时候另外一个线程就被阻断
        // 但是当初始化完成后，第二个线程继续走同步代码块
        if (instance==null){
            synchronized(LockSingleton.class){
                //此时需要再次验证，以确保第二个线程不会创建实例。这里的第二道锁判断保证了单例。
                if (instance==null){
                    instance = new LockSingleton();
                }
            }
        }
        return instance;
    }


}
