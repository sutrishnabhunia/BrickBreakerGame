
import javax.swing.JFrame;

public class Game {
    public static void main(String[] args) {
        JFrame obj = new JFrame();
        GamePlay gameplay = new GamePlay();
        obj.setTitle("Brick Breaker");
        obj.setVisible(true);
        obj.setResizable(false);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj.setBounds(10,10,700,600);
        obj.add(gameplay);
    }
}
