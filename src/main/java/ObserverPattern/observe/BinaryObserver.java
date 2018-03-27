package ObserverPattern.observe;

import ObserverPattern.Subject;

/**
 * Created by AceCream on 2017/11/30.
 */
public class BinaryObserver extends Observer {

    public BinaryObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Binary String:"+Integer.toBinaryString(subject.getState()));
    }



}
