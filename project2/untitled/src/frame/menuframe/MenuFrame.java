package frame.menuframe;

import javax.swing.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class MenuFrame extends JFrame {
    //1.将所有组件定义到自定义窗口类的成员变量
    JMenuBar bar;
    JMenu menu,submenu;
    JMenuItem it1,it2,it3;
    public  MenuFrame(String title,int x,int y,int width,int height){
        //2.实例化组件
        bar=new JMenuBar();
        menu=new JMenu("菜单");
        submenu=new JMenu("子菜单");
        it1=new JMenuItem("菜单项1",new ImageIcon("images/toolbar/about.png"));
        it1.setAccelerator(KeyStroke.getKeyStroke('A'));
        it2=new JMenuItem("菜单项2",new ImageIcon("images/toolbar/admin.png"));
        it2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_DOWN_MASK));
        it3=new JMenuItem("子菜单",new ImageIcon("images/toolbar/library.png"));
        //3.根据布局完成组件摆放
        submenu.add(it3);
        menu.add(it1);
        menu.addSeparator();
        menu.add(it2);
        menu.add(submenu);
        bar.add(menu);
        this.setJMenuBar(bar);
        //4.设置窗口的属性
        this.setTitle(title);
        this.setBounds(x,y,width,height);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
