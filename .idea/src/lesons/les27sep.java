package lesons;

/**
 * Created by Катя on 17.11.2015.
 */
public class les27sep {
    public static void main(String[] args) {
        int [] a;
        a = new int [100];
        int el = 0;
        for (int x : a) {



            System.out.println(a);
        }
    }
}
//==============================================
//      boolean t = true;
//      first:
//    {
//      second:
//     {
//          third:
//          {
//             System.out.println("Before the break");
//           if (t) break second;
//          System.out.println("This wont exec");
//       }
//          System.out.println("This wont execute");
//    }

//       System.out.println("THIS is after second");
//    }
//  }
//  }
//--------------------------------
//      for(int i=0;i<10;i++) {
//           if (i % 2 == 0) continue;
//          System.out.println(i);
//       }
//   }
//  }
//_______________________________________

//     int sum = 0;
//       int nums[][] = new int[3][5];
//       for(int i = 0; i < 3; i++)
//          for(int j = 0; j < 5; j++)
//             nums[i][j] = (i+1)*(j+1);
//    for(int x[] : nums){
//        int sum1 = 0;
//        for(int y:x){
//           ;
//           System.out.println("value " + y);
//          sum+=y;
//           sum1+= y;
//        }
//       System.out.println(sum1);
//  }
//  System.out.println("Summation: " + sum);
//  }
//   }
//  ________________________________________

// int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//   int sum = 0;
//  for (int x : nums) {
//            sum += x;

//    }
//    System.out.println("Summation: " + sum);
//   }
//}