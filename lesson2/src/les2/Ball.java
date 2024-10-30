package les2;

import java.awt.*;
import java.util.Random;

public class Ball extends Sprite {
    private static Random rnd = new Random();
    private final Color color;
    private float vX;
    private float vY;

    Ball(){
        halfHeight = 20 + (float)(Math.random()*50f);
        halfWigth = halfHeight*2;
        color = new Color(rnd.nextInt());
        vX = 100f + (float)(Math.random()*200f);
        vY = 100f + (float)(Math.random()*200f);

    }

    @Override
    void render (MainCanvas canvas, Graphics g){
        g.setColor(color);
        g.fillOval((int) getLeft(), (int)getTop(), (int)getHalfHeight(), (int)getHalfWigth());
    }

     @Override
    void update(MainCanvas convas, float deltaTime){
        x += vX*deltaTime;
        y += vY*deltaTime;

        if (getLeft()<convas.getLeft()){
            setLeft(convas.getLeft());
            vX = -vX;
        }
        if (getRight() > convas.getRight()){

        }
         if (getTop() < convas.getTop()){

         }
         if (getBottom() > convas.getBottom()){

         }

    }





}












