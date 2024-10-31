package firstGame;

import common.MainCanvas;
import common.Sprite;

import java.awt.*;
import java.util.Random;

public class Ball extends Sprite {
    private static Random rnd = new Random();
    private final Color color;
    private float vX;
    private float vY;

    Ball(){
        halfHeight = 5 + (float)(Math.random()*50f);
        halfWigth = halfHeight;
        color = new Color(rnd.nextInt());
        vX = 100f + (float)(Math.random()*200f);
        vY = 100f + (float)(Math.random()*200f);
    }

    @Override
    public void render (MainCanvas canvas, Graphics g){
        g.setColor(color);

        g.fillOval((int)getLeft(), (int)getTop(), (int)getHalfHeight(), (int)getHalfWigth());
    }

     @Override
    public void update(MainCanvas convas, float deltaTime){
        x += vX*deltaTime;
        y += vY*deltaTime;
        convas.setColor(color);
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












