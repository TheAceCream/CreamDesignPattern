package ObserverPattern.observe;

import ObserverPattern.Subject;

/**
 * Created by AceCream on 2017/11/29.
 */
public abstract class Observer {

    protected Subject subject;
    public abstract void update();

}