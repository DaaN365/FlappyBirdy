package FB;

import java.awt.*;

public class Bird {
    int x;
    int y;
    int width = 34;
    int height = 24;
    int rychlostY = 0;
    int gravitace = 1;


    public Bird(int startX, int startY) {
        this.x = startX;
        this.y = startY;
    }

    public void draw(Graphics g) {
        g.setColor(Color.YELLOW);
        g.fillRect(x, y, width, height);
    }

    public void skoc(){
        rychlostY = -15;
    }

    public void posunSe(){
        rychlostY += gravitace;
        y += rychlostY;
    }
}
