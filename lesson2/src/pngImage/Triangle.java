package pngImage;

import common.MainCanvas;
import common.Sprite;

import java.awt.*;
import java.util.Random;

public class Triangle extends Sprite {
    private static Random rnd = new Random();
    private final Color color;
    private float vX;
    private float vY;

    Triangle(){
        halfHeight = 20 + (float)(Math.random()*50f);
        halfWigth = halfHeight*2;
        color = new Color(rnd.nextInt());
        vX = 200f + (float)(Math.random()*200f);
        vY = 100f + (float)(Math.random()*200f);
    }

    @Override
    public void render (MainCanvas canvas, Graphics g){
        g.setColor(color);
        g.fillRect((int) getLeft(), (int)getTop(), (int)getHalfHeight(), (int)getHalfWigth());
    }

     @Override
    public void update(MainCanvas convas, float deltaTime){
        x += 5*vX*deltaTime;
        y += 5*vY*deltaTime;

        if (getLeft()<convas.getLeft()){
            setLeft(convas.getLeft());
            vX = -vX;
        }
        if (getRight() > convas.getRight()){
            setRight(convas.getRight());
            vX = -vX;
        }
         if (getTop() < convas.getTop()){
             setTop(convas.getTop());
             vY = -vY;
         }
         if (getBottom() > convas.getBottom()){
             setBottom(convas.getBottom());
             vY = -vY;
         }

    }





}












