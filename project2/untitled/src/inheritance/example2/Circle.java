package inheritance.example2;

public class Circle implements Ishape {
    private    double r;

    public Circle(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
    @Override
    public void Length() {
        System.out.println("圆的周长："+(2*Math.PI*r));
    }

    @Override
    public void Area() {
        System.out.println("圆的面积："+(Math.PI*r*r));
    }
}
