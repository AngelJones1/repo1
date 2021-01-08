package Practice.toenum;
  enum Season {   //鏋氫妇鍚�
     春,夏,秋,冬; //甯搁噺鍒楄〃
}
 enum week{
    星期一, 星期二, 星期三, 星期四, 星期五, 星期六, 星期天;
}
public class Test {

    public static void main(String[] args) {

        System.out.println(Season.春);
        week x=week.星期二;
        if(x==week.星期二){
            System.out.println(x);
            System.out.println(010);
        }
    }
}
