package other.annotationTest;

/**
 * Created by AceCream on 2018/3/21.
 */
@Component(identifier = "worker")
public class UpperCaseComponent {

    public String doWork(String input){
        if (input!=null){
            return input.toUpperCase();
        }else {
            return null;
        }
    }

}
