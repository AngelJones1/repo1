package objiectComposition;

public class Circle {
    public  Point center;
    public   int  radius;
    public  Circle(){
     center=new Point(2,1);
      radius=2;
    }

    public Circle(int x,int y,int r) {
       center= new Point(x,y);
        radius=r;
    }

    public Circle(Point c, int r) {
        center = c;
        radius = r;
    }
    public double perimeter(){
        return  radius*2*Math.PI;
    }
    public  double  area(){
        return  radius*radius*Math.PI;
    }
    int relation1(Circle c){
        if((this.center.x == c.center.x&&this.center.y==c.center.y) && (this.radius == c.radius)){
            System.out.println("同一个圆");
            return 0;
        }
        else if(this.center.x == c.center.x&&this.center.y==c.center.y){
            System.out.println("同心圆");
            return 1;
        }
        else if((this.center.x != c.center.x||this.center.y!=c.center.y) && (center.distance(this.center,c.center) <= (this.radius + c.radius))){
            System.out.println("相交");

            return 2;
        }
        else if((this.center.x != c.center.x||this.center.y!=c.center.y) && (center.distance(this.center,c.center)) > (this.radius + c.radius)){
            System.out.println("分离");
            return 3;
        }
        else if((this.center.x != c.center.x||this.center.y!=c.center.y) && (center.distance(this.center,c.center)) <= Math.abs(this.radius - c.radius)){
            System.out.println("包含");
            return 4;
        }

        return -1;
    }
    int relation2(Circle c1,Circle c2){
        if((c1.center.x == c2.center.x&&c1.center.y==c2.center.y) && (c1.radius == c2.radius)){
            System.out.println("同一个圆");
            return 0;
        }
        else if(c1.center.x == c2.center.x&&c1.center.y==c2.center.y){
            System.out.println("同心圆");
            return 1;
        }
        else if((c1.center.x !=c2 .center.x||c1.center.y!=c2.center.y) && (center.distance(c1.center,c2.center) <= (c1.radius + c2.radius))){
            System.out.println("相交");

            return 2;
        }
        else if((c1.center.x != c2.center.x||c1.center.y!=c2.center.y) && (center.distance(c1.center,c2.center)) > (c1.radius + c2.radius)){
            System.out.println("分离");
            return 3;
        }
        else if((c1.center.x != c2.center.x||c1.center.y!=c2.center.y) && (center.distance(c1.center,c2.center)) <= Math.abs(c1.radius - c2.radius)){
            System.out.println("包含");
            return 4;
        }

        return -1;

    }
}
