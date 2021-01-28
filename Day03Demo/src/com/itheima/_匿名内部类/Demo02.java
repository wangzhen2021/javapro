package com.itheima._匿名内部类;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Demo02 {
    public static void main(String[] args) {
        //1.创建一个窗口
        JFrame jFrame = new JFrame("登录解密");
        //2.设置窗口大小
        jFrame.setSize(600,500);
        //3.居中
        jFrame.setLocationRelativeTo(null);
        //4. 为当前界面加上一个按钮
        JButton button = new JButton("陈攀吃屎吃屎");
        JPanel panel = new JPanel();
        panel.add(button);
        jFrame.add(panel);
        //5为当前按钮对象绑定一个电击监听器
        button.addActionListener(s ->System.out.println("男神攀吃了 一坨屎"));
        //6.显示窗口
        jFrame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        jFrame.setVisible(true);
    }
}
