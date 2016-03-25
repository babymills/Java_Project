package lesons;

/**
 * Created by Катя on 17.11.2015.
 */
public class avaregArrays {
    public static void main(String args[]) {
        int sum = 0;
        int nums[][] = new int[3][5];
        for(int i = 0; i < 3; i++)
            for(int j = 0; j < 5; j++)
                nums[i][j] = (i+1)*(j+1);
        for(int x[] : nums){
            int sum1 = 0;
            for(int y:x){

                System.out.println("value " + y);
                sum+=y;
                sum1+= y;
            }
            System.out.println(sum1);
        }
        System.out.println("Summation: " + sum);
    }
}