package cust;

public class Demo {
    public static void main(String[] args) {
        Cust c1=new Cust("Tom",100,"123456",10000);
        Cust c2=new Cust("zhangsan",101,"qwer",5000);
        Cust c3=new Cust("lisi",105,"iohk",9000);
        c1.getMoney(500);
        c2.saveMoney(500);
        c2.search();
        c3.changePWD();
        double m= Cust.sum(c1,c2,c3);
        System.out.println(m);
       Cust.sort(c1,c2,c3);
    }
}
