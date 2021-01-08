package student;

public class Test {
    public static void main(String[] args) {
        Graduate g1=new Graduate(10001,"jklove","软件工程","Mr.Li",65);
        Graduate g2=new Graduate(10002,"rmh","软件工程","Mr.Li",34);
        g1.showInfo();
        System.out.println();
        g2.showInfo();
    }
}
