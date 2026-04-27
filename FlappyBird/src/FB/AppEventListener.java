package FB;
import java.awt.*;
import java.awt.event.*;

public class AppEventListener implements KeyListener{
    GamePanel panel;

    public AppEventListener(GamePanel panel) {
        this.panel = panel;
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_SPACE) {
            panel.hracZmacknulSkok();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
}
