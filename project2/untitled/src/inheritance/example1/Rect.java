package inheritance.example1;

public class Rect extends Ishape {
    private double  length;
    private double wide;

    public Rect(double length, double wide) {
        this.length = length;
        this.wide = wide;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWide() {
        return wide;
    }

    public void setWide(double wide) {
        this.wide = wide;
    }

    @Override
    void Length() {
        System.out.println("矩形的周长："+(2*(wide+length)));

    }

    @Override
    void Area() {
        System.out.println("矩形的面积："+(wide*length));

    }
}
