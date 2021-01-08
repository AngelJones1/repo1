package student;

public class Graduate extends Undergraduate {
    private String teacher;
    private  int men;
    public Graduate(int num, String name, String classname, String teacher, int men) {
        super(num, name, classname);
        this.teacher=teacher;
        this.men=men;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("老师："+teacher+"\n论文数："+men);
    }
}
