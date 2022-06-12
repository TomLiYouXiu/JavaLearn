package System;

import java.util.Arrays;

public class Demo01 {
    public static void main(String[] args) {
        //数组复制  Arrays.copyOf其实用的就是System.arraycopy
        int[] a={12,3,4,5,7,45,7,9,7,3};
        int[] b=new int[8];
        System.arraycopy(a,0,b,0,5);
        System.out.println(Arrays.toString(b));
    }
}
