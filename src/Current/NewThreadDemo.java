package Current;

/**
 * Created by pc on 14.01.2016.
 */
public class NewThreadDemo {
    public static void main(String[] args) {
        new NewThread();//Cоздан новый поток
        try{
            for(int i=5;i>0 ;i--){
                System.out.println("Главный поток создан:"+i);
                Thread.sleep(1000);
            }


        } catch (InterruptedException e) {
            System.out.println("Главный поток прерван");
        }
        System.out.println("Главный поток завершен");
    }
}
