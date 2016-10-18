package com.zero.legendofthepeople.ui;

import javax.swing.*;

/**
 * Created by tyh on 2016/10/13.
 */
public class FrameGame extends JFrame {
    public FrameGame(){
        super("Legend Of The Peopele");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1200,720);//container的大小
        this.setResizable(false);//不能放大缩小窗口
        this.setLocationRelativeTo(null);//将窗口置于屏幕的中央
        this.setContentPane(new PanelGame());
        this.setVisible(true);

    }
}
