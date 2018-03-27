package ObserverPattern;

import ObserverPattern.observe.BinaryObserver;
import ObserverPattern.observe.HexaObserver;
import ObserverPattern.observe.OctalObserver;

/**
 * Created by AceCream on 2017/11/30.
 */
public class Demo {

    public static void main(String[] args) {
        Subject subject = new Subject();

        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("First state change:15");
        subject.setState(15);

        System.out.println("----------------------------------------------------------");

        System.out.println("Second state change:10");
        subject.setState(10);

    }
}
