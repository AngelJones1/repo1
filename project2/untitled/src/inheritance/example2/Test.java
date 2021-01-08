package inheritance.example2;

public class Test {
    public static void main(String[] args) {
        Ishape p1=new Circle(3);
        Ishape p2=new Rect(4,5);
        Ishape p3=new Triangle(3 ,4,5);
        p1.Length();
        p1.Area();
        p2.Length();
        p2.Area();
        p3.Length();
        p3.Area();
    }
}
