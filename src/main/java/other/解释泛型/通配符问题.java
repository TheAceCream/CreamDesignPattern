package other.解释泛型;

import java.util.Arrays;
import java.util.List;

/**
 * Created by AceCream on 2018/3/9.
 */
public class 通配符问题 {
}

class Animal{}
class Dog extends Animal{}
class Wolf extends Animal{}

class T1 {
    static List<Dog> dogList = Arrays.asList(new Dog());
    static List<Wolf> wolfList = Arrays.asList(new Wolf());
    //泛型类
    static class Reader<T> {
        T readExact(List<T> list) {
            return list.get(0);
        }
    }
    //报错了！
    public static void main(String[] args) {
        Reader<Animal> animalReader = new Reader<>();
//        animalReader.readExact(dogList);
//        animalReader.readExact(wolfList);
    }

}

//那我们需要用泛型中通配符去解决问题——> ?

class T2<T> {
    static List<Dog> dogList = Arrays.asList(new Dog());
    static List<Wolf> wolfList = Arrays.asList(new Wolf());

    //extend 就可以get了！
    T readCovariant(List<? extends T> list) {
        return list.get(0);
    }

    public static void main(String[] args) {
        T2<Animal> t2Reader = new T2<>();
        Animal a1 = t2Reader.readCovariant(dogList);
        Animal a2 = t2Reader.readCovariant(wolfList);
    }

}





