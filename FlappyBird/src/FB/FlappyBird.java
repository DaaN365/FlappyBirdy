package FB;

import javax.swing.*;

public class FlappyBird {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Moje Flappy Bird");
        GamePanel gamePanel = new GamePanel();

        frame.add(gamePanel);
        frame.pack(); // Zmenší/zvětší okno přesně podle rozměrů GamePanelu
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null); // Vycentruje okno na monitoru
        frame.setResizable(false);
        frame.setVisible(true);
    }
}
