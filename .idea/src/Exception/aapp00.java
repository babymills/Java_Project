package Exception;

import java.sql.SQLException;

/**
 * Created by PC on 11.03.2016.
 */
public class aapp00 {
    void a() throws Error{
        try {
            b();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    void b()throws Exception,OutOfMemoryError{}
}
