package objiectComposition;

public class Demo {
    public static void main(String[] args) {
        Point   p=new Point();
        Point  p1=new Point(2,1);
        Point  p2=new Point(8,10);
        System.out.println("输出自己输入的点的值：x1="+p1.x+" y2="+p1.y+" x2="+p2.x+" y2="+p2.y);
        System.out.println("计算出两点间的距离：d="+p.distance(p1,p2));
          Circle m= new Circle();
        System.out.println("输出圆类结构体方法Circle()初始化的x，y，r的值：x="+m.center.x+" y="+m.center.y+" r="+m.radius);
          Circle m1=new Circle(2,3,3);
        System.out.println("输出圆类重载结构体方法Circle(int x,int y,int r)初始化的x，y，r的值：x="+m1.center.x+" y="+m1.center.y+" r="+m1.radius);
         Circle m2=new Circle(p1,2);
        System.out.println("输出圆类重载结构体方法Circle(Point p，int r)初始化的x，y，r的值：x="+m2.center.x+" y="+m2.center.y+" r="+m2.radius);
        double c1=m.perimeter();
        double s1=m.area();
        System.out.println("输出初始化圆1的周长：C="+c1);
        System.out.println("输出初始化圆1的面积：C="+s1);
        double c2=m1.perimeter();
        double s2=m1.area();
        System.out.println("输出初始化圆2的周长：C="+c2);
        System.out.println("输出初始化圆2的面积：C="+s2);
        double c3=m2.perimeter();
        double s3=m2.area();
        System.out.println("输出初始化圆3的周长：C="+c3);
        System.out.println("输出初始化圆3的面积：C="+s3+"\n");
        System.out.println("判断圆2与初始化圆1的关系：");
        System.out.println(m.relation1(m1)+"\n");
        System.out.println("判断圆3与初始化圆1的关系：");
        System.out.println(m.relation1(m2)+"\n");
        System.out.println("判断圆2与圆3的关系：");
        System.out.println(m.relation2(m1,m2));

    }
}
