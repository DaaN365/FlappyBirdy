package FB;

import java.awt.*;

public class Pipe {
    int x;
    int y;
    int width = 64;
    int height = 512;
    Image image;
    int rychlostX = -4;

    public Pipe(int startX, int startY) {
        this.x = startX;
        this.y = startY;
    }

    public void move() {
        x -= rychlostX;
    }

    public void draw(Graphics g) {
        if (image != null) {
            g.drawImage(image, x, y, width, height, null);
        } else {
            g.setColor(Color.BLACK);
            g.fillRect(x, y, width, height);
        }
    }
}
