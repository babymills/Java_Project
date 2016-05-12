package Thread_Current.Lab;

/**
 * Created by привет on 30.04.2016.
 */
public class RabbitAttack {
    public static void main(String[] args) throws InterruptedException {
for(int i = 1; i<Integer.MAX_VALUE;i++){
    String spaces = spaces(i);
    PrintRunne print = new PrintRunne(spaces+i,100);
    Thread thread = new Thread(print);
    thread.start();
    thread.sleep(100);
}
    }
    static String spaces(int c){
        String spaces = "";
        for(int i = 0;i<c;i++){
            spaces += " ";}
        return spaces;
    }
}
