package Generics;

/**
 * Created by Катя on 17.11.2015.
 */
public class Gen<T,E extends Number> {
    private T data;
    private E da;

    public Gen(T data, E da) {
        this.data = data;
        this.da = da;
    }
   void showType(){
       System.out.println("Type T "+data.getClass());
       System.out.println("Type Е "+da.getClass());
   }
    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public E getDa() {
        return da;
    }

    public void setDa(E da) {
        this.da = da;
    }
}

