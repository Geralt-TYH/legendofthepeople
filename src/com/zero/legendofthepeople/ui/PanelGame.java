package com.zero.legendofthepeople.ui;

import javax.swing.*;
import java.awt.*;


/**
 * Created by tyh on 2016/10/13.
 */
public class PanelGame extends JPanel {
    public PanelGame(){
        this.setVisible(true);
    }

    protected void paintComponent(Graphics g) {
        new Lay(0,0,getParent().getWidth(),getParent().getHeight()).createWindow(g);
    }
}
