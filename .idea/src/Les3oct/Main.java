package Les3oct;

import java.util.Arrays;

/**
 * Created by Катя on 17.11.2015.
 */
public class Main {
        public static void main(String[] args) {
            int[]arr;
            arr = new int[]{0,1,2};
            System.out.print(Arrays.toString(arr)+"->");
            fdg.invert(arr);
            System.out.println(Arrays.toString(arr));
        }
    }



  /*  public static void invert(int[] arr) {//???????? ?????? ?? ?????
        for (int k = 0; k < arr.length / 2; k++) {
            int tmp = arr[k];
            arr[k] = arr[arr.length - k - 1];
            arr[arr.length - k - 1] = tmp;//???????? ??????? ????????
        }
    }
}
            /*
            int [] a = {0,1,2,3,4,5};
                    int sum = 0;
                    for(int b:a)
                        sum+=b;
            System.out.println(sum);
        }
        }
            //__-------------------------
            /*
            for(String arg : args)
                System.out.println(Arrays.toString(args));
        }
}
//__________________________________
      /*      int[]array1D = {0,1,2,3};
            int[][] array2D = {{0,1} , {2,3}};
            System.out.println(array1D);
            System.out.println(Arrays.toString(array1D));
            System.out.println(array2D);
            System.out.println(Arrays.toString(array2D));// ?????? ???????
            System.out.println(Arrays.deepToString(array2D));//???????? ?? ????? ???????
        }
        }
       // ----------------------------------
         /*   System.out.println(Integer.toString(262));
            System.out.println(Integer.toBinaryString(262));
            System.out.println(Integer.toHexString(267));//
            System.out.println(Integer.toOctalString(267));//????????????? ? ??????
        }
        }
        //-----------------------------------
           /* String strInt = "123"; String strDouble = "123.456";
            int x; double y;
            x = Integer.parseInt(strInt);//????????????? ?????? ? ?????
            y = Double.parseDouble(strDouble);
            System.out.println("x=" + x);
            System.out.println("y=" + y);
            strInt = String.valueOf(x+1);
            strDouble = String.valueOf(y +1);
            System.out.println("strInt="+strInt);
            System.out.println("strDouble="+strDouble);
            String str;
            str = "num=" + 345;
            System.out.println(str);
        }
    }*/
