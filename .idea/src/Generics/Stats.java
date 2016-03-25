package Generics;

/**
 * Created by Катя on 17.11.2015.
 */
class Stats<T extends Number> {
    T[] nums;
    Stats(T[] o) {
        nums = o;
    }


    double average() {
        double sum = 0.0;

        for(int i=0; i < nums.length; i++)
            sum += nums[i].doubleValue();

        return sum / nums.length;}
        boolean sam(Stats<?>ob){ //проверка на равенство двух массивов
        if(average()==ob.average())
            return true;
            return false;

        }
   /* static <T extends Comparable<T>,V extends T>
    boolean isIn(T x,V[] y){
        for ( int i=0 ; i < y.length; i++)
            if(x.equals(y[i]))
        return true ;
        return false ;
    } метод проверяет если заданное число в массиве пример на стр 415*/
    }


