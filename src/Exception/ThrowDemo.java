package Exception;

/**
 * Created by pc on 14.01.2016.
 */
public class ThrowDemo{//throw нужен для создания исключений вручную
    static  void demoproc(){
        try{
            throw new NullPointerException("demostracia");
        }catch (NullPointerException e){
            System.out.println("иСКЛЮЧЕНЕИ ПЕРЕХВАЧЕННО ");
            throw e;

        }
    }

    public static void main(String[] args) {
        try{
demoproc();
        }catch (NullPointerException e){
            System.out.println("Povtor "+e);

        }
    }
}
