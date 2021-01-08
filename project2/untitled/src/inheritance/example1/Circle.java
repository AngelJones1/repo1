package inheritance.example1;

public class Circle extends Ishape {
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
    void Length() {
        System.out.println("圆的周长："+(2*Math.PI*r));

    }

    @Override
    void Area() {
        System.out.println("圆的面积："+(Math.PI*r*r));
    }
}
