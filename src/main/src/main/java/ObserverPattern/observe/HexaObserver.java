package ObserverPattern.observe;

import ObserverPattern.Subject;

/**
 * Created by AceCream on 2017/11/30.
 */
public class HexaObserver extends Observer {

    public HexaObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Hexa String:"+Integer.toHexString(subject.getState()));
    }


}
