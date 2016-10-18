package com.zero.legendofthepeople.ui;

import javax.swing.*;
import java.awt.*;

/**
 * Created by tyh on 2016/10/13.
 */
public class Lay {
    /*图层左上角X,Y*/
    private int x;
    private int y;
    /*图层的宽高W,H*/
    private int w;
    private int h;
    private final static int SIZE=7;
    private Image WINDOW_IMG=new ImageIcon("src\\picture\\bg.jpg").getImage();
    private int imgW=WINDOW_IMG.getWidth(null);
    private int imgH=WINDOW_IMG.getHeight(null);
    public Lay(int x, int y, int w, int h) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }
    public void createWindow(Graphics g){
        //左上角
        g.drawImage(WINDOW_IMG,x,y,x+SIZE,y+SIZE,0,0,SIZE,SIZE,null);
        //中上
        g.drawImage(WINDOW_IMG,x+SIZE,y,x+w-SIZE,y+SIZE,SIZE,0,imgW-SIZE,SIZE,null);
        //右上角
        g.drawImage(WINDOW_IMG,x+w-SIZE,y,x+w,y+SIZE,imgW-SIZE,0,imgW,SIZE,null);
        //左中
        g.drawImage(WINDOW_IMG,x,y+SIZE,x+SIZE,y+h-SIZE,0,SIZE,SIZE,imgH-SIZE,null);
        //中
        g.drawImage(WINDOW_IMG,x+SIZE,y+SIZE,x+w-SIZE,y+h-SIZE,SIZE,SIZE,imgW-SIZE,imgH-SIZE,null);
        //右中
        g.drawImage(WINDOW_IMG,x+w-SIZE,y+SIZE,x+w,y+h-SIZE,imgW-SIZE,SIZE,imgW,imgH-SIZE,null);
        //左下
        g.drawImage(WINDOW_IMG,x,y+h-SIZE,x+SIZE,y+h,0,imgH-SIZE,SIZE,imgH,null);
        //中下
        g.drawImage(WINDOW_IMG,x+SIZE,y+h-SIZE,x+w-SIZE,y+h,SIZE,imgH-SIZE,imgW-SIZE,imgH,null);
        //右下
        g.drawImage(WINDOW_IMG,x+w-SIZE,y+h-SIZE,x+w,y+h,imgW-SIZE,imgH-SIZE,imgW,imgH,null);
    }
}
