package FB;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GamePanel extends JPanel implements ActionListener {
    int boardWidth = 360;
    int boardHeight = 640;

    Bird ptak;
    Timer heroSmycka;

    Image background;

    public GamePanel() {
        this.setPreferredSize(new Dimension(boardWidth, boardHeight));

        background = new ImageIcon(getClass().getResource("/background.png")).getImage();

        int startX = boardWidth / 8;
        int startY = boardHeight / 2;
        ptak = new Bird(startX, startY);

        this.setFocusable(true);
        AppEventListener posluchac = new AppEventListener(this);
        this.addKeyListener(posluchac);

        heroSmycka = new Timer(16, this);
        heroSmycka.start();
    }

    public void hracZmacknulSkok() {
        ptak.skoc();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(background, 0, 0, boardWidth, boardHeight, null);
        ptak.draw(g);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ptak.posunSe();
        repaint();
    }
}
