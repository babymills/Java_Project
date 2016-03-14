package Interface.SharedConst;

/**
 * Created by pc on 12.01.2016.
 */
interface SharedConstants {
    int NO = 0;
    int YES = 1;
    int MAYBE = 2;
    int LATER = 3;
    int SOON = 4;
    int NEVER= 5;
     static int getNum(){
        return  0 ;
    }
    int vc = SharedConstants.getNum();//статические методы из интерфейсов не наследуются ни
    //реализующими их классами, ни подчиненными
    // объект - это экземпляр класса
}
