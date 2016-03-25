package Less14_11;

import java.util.Comparator;

/**
 * Created by IT_School on 14.11.2015.
 */
class MyComp implements Comparator<String> {
public int compare(String a,String b){
    String asTr,bsTr;
    asTr=a;
    bsTr=b;
    return bsTr.compareTo(asTr);}
}

