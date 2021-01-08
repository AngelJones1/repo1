package extendcust.test;

import extendcust.cust.Cust;
import extendcust.vipCust.Vip;

public class Test {
    public static void main(String[] args) {
       Vip v1=new Vip("Tom",100,"123456",1000);
       Vip v2=new Vip("zhangsan",101,"qwer",5000);
        Cust c1=new Cust("Tom",100,"123456",1000);
        v1.search();
        v2.search();
       c1.getMoney(1000);
       c1.getMoney(1);
        v1.getMoney(1000);
        v1.getMoney(100);
        v1.getMoney(900);
        v1.getMoney(3000);
        v1.changeMoney(v2,500);
        v1.search();
        v2.search();
    }
}
