package Exception;

import javax.management.RuntimeMBeanException;
import java.io.IOException;
import java.sql.SQLException;

/**
 * Created by PC on 11.03.2016.
 */
public class Apppp11 {
    public static void main(String[] args) throws IOException,SQLException {//MultiCatch
        try{
            if(System.nanoTime()% 2 ==0){
                throw new IOException();
            }else
                throw new SQLException();
//            Throwable t = new RuntimeException();
//            throw t;
        }catch (IOException e){
            System.out.println("IO");
           throw e;

        }catch (SQLException e){
            System.out.println("SQL");
            throw e;
        }/*catch (SQLException |IOException e){
            System.out.println("SQL");
            throw e;
        }*/
    }
}
