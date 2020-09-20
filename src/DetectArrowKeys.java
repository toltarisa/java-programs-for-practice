import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class DetectArrowKeys {
    int upCount = 0;
    int downCount = 0;
    int rightCount = 0;
    int leftCount = 0;
    public DetectArrowKeys(){
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);
        frame.setFocusable(true);

        JPanel panel = new JPanel();
        JLabel up = new JLabel("Up : 0");
        JLabel down = new JLabel("Down : 0");
        JLabel right = new JLabel("Right : 0");
        JLabel left = new JLabel("Left : 0");

        panel.add(up);
        panel.add(down);
        panel.add(right);
        panel.add(left);





        frame.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                int keycode = e.getKeyCode();
                switch (keycode) {
                    case KeyEvent.VK_UP:

                        up.setText("Up : "+upCount++);
                        break;
                    case KeyEvent.VK_DOWN:
                        down.setText("Down : "+downCount++);
                        break;
                    case KeyEvent.VK_RIGHT:
                        right.setText("Right : "+rightCount++);
                        break;

                    case KeyEvent.VK_LEFT:
                        left.setText("Left : "+leftCount++);
                        break;

                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });
        frame.add(panel);
    }

    public static void main(String[] args) {
        new DetectArrowKeys();

    }
}
