package other.LittleTest;

/**
 * Created by AceCream on 2018/3/9.
 */
public abstract class Test{

    public static void main(String[] args) {
        Thread[] thread = new Thread[3];
        for (int i=0;i<3;i++){
            thread[i] = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int j=0;j<5;j++){
                        System.out.print(j);
                    }
                    System.out.print(" ");
                }
            });
        }

        for (Thread t : thread) {
            t.start();
        }

    }

}