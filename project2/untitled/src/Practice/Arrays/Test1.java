package Practice.Arrays;

import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) {
        int a[]={1,5,2,4,3,6,7};
        for (int c:a
             ) {
            System.out.print(c+" ");

        }
        System.out.println();

        int c[]=a;
        System.out.println(Arrays.toString(c));
        int b[]=new  int[12];
        System.arraycopy(a,3,b,0,2);
        System.out.println(Arrays.toString(b));
       int d[]=Arrays.copyOf(a,a.length);
        System.out.println(Arrays.toString(d));
        int e[]=Arrays.copyOfRange(a,2,4);
        System.out.println(Arrays.toString(e));
        Arrays.sort(a,1,3);
        System.out.println(Arrays.toString(a));
      int k=Arrays.binarySearch(a,5);
        System.out.println(k);
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.binarySearch(a,5));


    }
}
