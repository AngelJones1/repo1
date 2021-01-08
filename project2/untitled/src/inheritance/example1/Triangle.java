package inheritance.example1;

public class Triangle extends Ishape {
    private  double a;
    private  double b;
    private  double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }



        @Override
        void Length () {
        if (a+b>c&&a+c>b&&c+b>a)
        System.out.println("三角形的周长："+(a+b+c));
        else
            System.out.println("你输入的三边长错误");
    }

        @Override
        void Area () {
            if (a+b>c&&a+c>b&&c+b>a){
              double   p=(a+b+c)/2;
        System.out.println("三角形的面积："+(Math.sqrt(p*(p-a)*(p-b)*(p-c))));
            }
            else
                System.out.println("你输入的三边长错误");
    }

}
