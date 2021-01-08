package extendcust.vipCust;

import extendcust.cust.Cust;

public class Vip extends Cust {
    public Vip(String name, int id, String pwd, int money) {
        super(name, id, pwd, money);
    }



    @Override
    public void getMoney(int a) {
        if (super.getMoney()-a>=0){
            super.setMoney(super.getMoney()-a);
            System.out.println("取款成功！");
        }
       else if (super.getMoney()-a>=-3000){
            System.out.println("预支成功！");
            super.setMoney(super.getMoney()-a);
            System.out.println("你已欠款："+super.getMoney()+",避免您的信用下滑,请在截止日前还款！");
        }
       else if(super.getMoney()-a<-3000){
            System.out.println("预支已超额，无法支付！");
            System.out.println("你已欠款："+super.getMoney()+",避免您的信用下滑,请在截止日前还款！");
        }
    }

    public  void changeMoney(Cust p,int money ){
        if (money<=p.getMoney()) {
            super.setMoney(money + super.getMoney());
            p.setMoney(p.getMoney()-money);
        }
        System.out.println("您已完成转款！");
    }
}
