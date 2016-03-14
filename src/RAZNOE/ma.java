package RAZNOE;

/**
 * Created by PC on 10.03.2016.
 */
public class ma {
    static int[] x(int[] v) {
        for(int gi = v.length-1;gi>0;gi--)
            {for(int i = 0;i<gi;i++){
                 if(v[i]>v[i+1]){
                     int t = v[i];
                     v[i]=v[i+1];
                     v[i+1]=t;
                 }

            }
        }
return v;
    }
}
