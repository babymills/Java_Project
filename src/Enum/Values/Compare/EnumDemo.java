package Enum.Values.Compare;

/**
 * Created by pc on 18.01.2016.
 */
public class EnumDemo {
    public static void main(String[] args) {
        EnumDe ap,ap2,ap3;
        for(EnumDe a: EnumDe.values())
            System.out.println(a+" "+a.ordinal());//получить порядковы значения
        ap =EnumDe.Del;
        ap2 = EnumDe.Red;
        ap3 =  EnumDe.Del;
        System.out.println() ;
        //продемонстрировать применение методов сошраrеТо () и equals ()
        if(ap.compareTo(ap2)< 0)
        System.out.println( ap + " предшествует " + ap2 ) ;
        if(ap.compareTo( ap2 ) > 0)
        System.out.println( ap2 + " предшествует " + ap ) ;
        if(ap.compareTo(ap3)== 0)
        System.out.println(ap +"равно "+ap3) ;
        System.out.println();
        if(ap.equals(ap2))
        System.out.println("Oшибкa !");
        if(ap.equals(ap3))
        System.out.println( ap + " равно "+ ap3 ) ;
        if ( ap ==ap3 )
        System.out.println(ap + " ==" + ap3 ) ;
        }
}
