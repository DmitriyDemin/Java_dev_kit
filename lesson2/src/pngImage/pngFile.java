package pngImage;

import common.MainCanvas;
import common.Sprite;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileReader;
import java.util.Random;

public class pngFile extends Sprite {
    private static Random rnd = new Random();
    private final Color color;
    private float vX;
    private float vY;



    add(picLabel);


    pngFile(){
        BufferedImage myPicture = ImageIO.read(new File("src/repositoriy/github.png"));
        JLabel picLabel = new JLabel(new ImageIcon(myPicture));

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












