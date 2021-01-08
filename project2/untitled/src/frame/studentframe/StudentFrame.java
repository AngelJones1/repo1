package frame.studentframe;

import javax.swing.*;

public class StudentFrame extends JFrame {
    //1.将菜单组件定义到窗口类中
JMenuBar bar;
JMenu mu1,mu2,mu3,mu4;
JMenuItem it1,it2,it3,it4,it5,it6,it7,it8,it9,it10;
public  StudentFrame(String title,int x,int y,int width,int height){
    //2.实例化组件成员变量
    bar=new JMenuBar();
    mu1=new JMenu("数据维护");
    mu2=new JMenu("数据查询");
    mu3=new JMenu("数据显示");
    mu4=new JMenu("数据维护");
    it1=new JMenuItem("班级管理",new ImageIcon("images/toolbar/login.png"));
    it2=new JMenuItem("数据添加",new ImageIcon("images/toolbar/storage.png"));
    it3=new JMenuItem("数据修改",new ImageIcon("images/toolbar/modifybook.png"));
    it4=new JMenuItem("数据删除",new ImageIcon("images/toolbar/lostbook.png"));
    it5=new JMenuItem("退出系统",new ImageIcon("images/toolbar/exit.png"));
    it6=new JMenuItem("按学号查询",new ImageIcon("images/toolbar/query.png"));
    it7=new JMenuItem("浏览",new ImageIcon("images/toolbar/tt6.png"));
    it8=new JMenuItem("用户管理",new ImageIcon("images/toolbar/readerinfo.png"));
    it9=new JMenuItem("关于",new ImageIcon("images/toolbar/about.png"));
    it10=new JMenuItem("帮助",new ImageIcon("images/toolbar/tt9.png"));
    mu1.add(it1);
    mu1.addSeparator();
    mu1.add(it2);
    mu1.add(it3);
    mu1.add(it4);
    mu1.addSeparator();
    mu1.add(it5);
    mu2.add(it6);
    mu3.add(it7);
    mu4.add(it8);
    mu4.add(it9);
    mu4.add(it10);
    bar.add(mu1);
    bar.add(mu2);
    bar.add(mu3);
    bar.add(mu4);
    this.setJMenuBar(bar);
 this.setTitle(title);
 this.setBounds(x,y,width,height);
 this.setVisible(true);
 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

}
}
