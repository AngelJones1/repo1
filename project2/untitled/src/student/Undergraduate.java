package student;

public class Undergraduate {
     private   int num;
    private String name;
    private String classname;

    public Undergraduate(int num, String name, String classname) {
        this.num = num;
        this.name = name;
        this.classname = classname;
    }
 public  void showInfo(){
     System.out.println("学号："+num+"\n姓名："+name+"\n班级："+classname);
 }
    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }


}
