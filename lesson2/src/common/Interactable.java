package common;

import java.awt.*;

public interface Interactable {
    void update (MainCanvas canvas, float deltaTime);
    public void render (MainCanvas canvas, Graphics g);
}
