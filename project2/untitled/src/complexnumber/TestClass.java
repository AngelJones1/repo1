package complexnumber;

import java.sql.SQLOutput;

public class TestClass {
    public static void main(String[] args) {
        ComplexNumber c=new ComplexNumber();
          c.setM_dImaginPar(3);
          c.setM_dRealPart(2);
        ComplexNumber c1=new ComplexNumber(3,4);
        ComplexNumber c2=new ComplexNumber(2,6);
        System.out.println("输出初始化的复数：");
        System.out.println(c.toString());
        System.out.println("调用complexAdd（ComplexNumber c）并输出：");
        System.out.println(c.complexAdd(c1).toString());
        System.out.println("调用complexMinus（ComplexNumber c）并输出：");
        System.out.println(c.complexMinus(c1).toString());
        System.out.println("调用complexAdd（ComplexNumber b，ComplexNumber c）并输出：");
        System.out.println(c.complexAdd1(c1,c2).toString());
        System.out.println("调用complexMinus（ComplexNumber b，ComplexNumber c）并输出：");
        System.out.println(c.complexMinus1(c1,c2).toString());

    }

}
