package les2;

import java.awt.*;

public abstract class Sprite {
    protected float x;
    protected float y;
    protected float halfWigth;
    protected float halfHeight;

    protected float getLeft() {
        return x-halfWigth;
    }
    protected void setLeft(float left) {
        x = left+halfWigth;
    }
    protected float getRight() {return x+halfWigth;}
    protected void setRight(float right) {x= right-halfWigth;}
    protected float getTop() {return y-halfHeight;}
    protected void setTop(float top) {y = top + halfHeight;}
    protected float getBottom() {return y+halfHeight;}
    protected void setBottom(float bottom) {y = bottom - halfHeight;}

    protected float getHalfWigth(){return 2f*halfWigth;}
    protected float getHalfHeight() {return 2f*halfHeight;}

    void update(MainCanvas canvas, float deltaTime){};
    void render(MainCanvas canvas, Graphics g){};





}
























