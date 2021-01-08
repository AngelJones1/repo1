package Practice.Arrays;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[][] b={{2,1},{4,6,7},{8,9,12,45}};
        for (int i = 0; i <b.length ; i++) {
            for (int j = 0; j <b[i].length ; j++) {
                System.out.print(b[i][j]+" ");

            }
            System.out.println();

        }
        String[][] a= new String[5][];
        for (int i = 0; i <a.length ; i++) {
            a[i]=new String[i+1];

        }
        for (int i = 0; i <a.length ; i++) {
                for (int j = 0; j <a[i].length ; j++) {
                    a[i][j]=input.next();
                }

        }
        for (int i = 0; i <a.length ; i++) {
            for (int j = 0; j <a[i].length ; j++) {
                System.out.print(a[i][j]);

            }
            System.out.println();

        }
    }
}
