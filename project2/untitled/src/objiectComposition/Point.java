package objiectComposition;

public class Point {
    int x;
    int y;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    public Point(){

    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    double distance(Point p1,Point p2){
        double d=Math.sqrt((p1.x-p2.x)*(p1.x-p2.x)+(p1.y-p2.y)*(p1.y-p2.y));
        return  d;
    }


}
