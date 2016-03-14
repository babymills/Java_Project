package Exception;

/**
 * Created by pc on 14.01.2016.
 */
public class FinallyDemo {
       // сгенерировать исключение в методе
        static void procA() {
            try {
                System.out.println(" B теле метода procA ()");
                throw new RuntimeException("дeмoнcтpaция ");
            } finally {
                    System. out . println (
                            "Блок оператора finally в методе procA() " ) ;}}
                    //возвратить управление из блока оператора try
                    static void procB () {
                        try {
                            System.out.println("B теле метода procB()");
                            return;
                        } finally {
                                System . out . println (
                                        " Блок оператора finally в методе procB() " ) ;}}
                              //  11 выполнить блок try, как обычно 276 Часть 1. Язы к Java
                                static void procC () {
                                    try {
                                        System.out.println(" B теле метода p rocC() ");
                                    }finally {
                                            System.out.println (
                                                    " Блок оператора finally в методе procC() " ) ;}}
                                            public static void main ( String args [ ] ) {
                                                try {
                                                    procA ( );}
                                                    catch ( Exception е) {
                                                        System.out.println("Иcключeниe перехвачено ");
                                                    }
                                                procB ( ) ;
                                                procC ( ) ;
}}
