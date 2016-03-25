package Current;

/**
 * Created by pc on 18.01.2016.
 */
class Egg extends Thread {

    @Override
    public void run() {
        for(int i=0;i<5;i++){
            try {
                sleep(1000);
            } catch (InterruptedException e) {}
                System.out.println("Egg");

        }
    }
}
