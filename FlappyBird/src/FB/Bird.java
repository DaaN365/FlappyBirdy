package FB;

import javax.swing.*;
import java.awt.*;

public class Bird {
    int x;
    int y;
    int width = 44;
    int height = 34;
    Image bird;
    int rychlostY = 0;
    int gravitace = 1;


    public Bird(int startX, int startY) {
        this.x = startX;
        this.y = startY;

        bird = new ImageIcon(getClass().getResource("/bird.png")).getImage();
    }

    public void draw(Graphics g) {
        g.drawImage(bird, x, y, width, height, null);
    }

    public void skoc(){
        rychlostY = -20;
    }

    public void posunSe(){
        rychlostY += gravitace;
        y += rychlostY;
    }
}
