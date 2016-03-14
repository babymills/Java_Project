package Current;

/**
 * Created by pc on 18.01.2016.
 */
public class Chichen {
    static Egg ob1;
    public static void main(String[] args) {
        ob1 = new Egg();
        System.out.println("Start");
        ob1.start();
        for(int i=0;i<5;i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            System.out.println("Chicken");
        }    if(ob1.isAlive()){
                try {
                    ob1.join();
                } catch (InterruptedException e) {  }
                System.out.println("First Egg");
            }
            else {
                System.out.println("First Chicken");
            }

        System.out.println("Finished");
    }
}
