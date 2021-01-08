package extendcust.cust;

import java.util.Scanner;

public class Cust {
	String name;
	private 	int id;
	private 	String pwd;
	private 	int money;
				int selfNum;
	private 	String bankName="建设银行";
	private 	static int allNum=0;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public int getSelfNum() {
		return selfNum;
	}
	public void setSelfNum(int selfNum) {
		this.selfNum = selfNum;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public Cust(String name, int id, String pwd, int money) {
		  this.name = name;
		  this.id = id;
		  this.pwd = pwd;
		  this.money = money;
		  allNum=allNum+1;
		  this.selfNum=allNum;
	}
	public   void getMoney(int a) {
		if(a<=this.money) {
			this.money = this.money - a;
			System.out.println("取款成功！");
		}
	 else
		 System.out.println("余额不足!");
	 }
	public void saveMoney(int a) {
		if(a>=0) {
			this.money = this.money + a;
			System.out.println("存款成功！");
		}
		else
			System.out.println("输入存款错误！");
	}
	public void search() {
		System.out.println("-----------------------------------");
		System.out.println("所属银行:"+ bankName);
		System.out.println("您是本行"+ allNum+"个顾客中的第"+selfNum+"个顾客");
		System.out.println("用户姓名:"+ name);
		System.out.println("用户账号："+ id);
		System.out.println("账户余额:"+ money);
		System.out.println("-----------------------------------");
	}
	public	void changePWD() {
		Scanner a=new Scanner(System.in);
		System.out.println("请输入要修改的密码：");
		this.pwd=a.next();
		System.out.println("密码修改完成！");
	}
	public static double sum(Cust...c) {
		int all=0;
		for(int i=0;i<c.length;i++)
		{
			all=all+c[i].money;
		}
		return all;
	}
	public static void sort(Cust...c) {
		Cust m;
		for (int j=0;j<c.length-1;j++){
		for (int i=0;i<c.length-1-j;i++) {

			if (c[i].money < c[i+1].money) {
				m= c[i];
				c[i] = c[i+1];
				c[i+1]=m;
			}
		}
		}
		for (int i=0;i<c.length;i++
			 ) {
			System.out.println(c[i].name+","+c[i].id+","+c[i].money);

		}
	}

}
