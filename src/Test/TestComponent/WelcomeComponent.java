package Test.TestComponent;

import javax.swing.*;
import java.awt.*;

public class WelcomeComponent extends JComponent {
    public static final int MESSAGE_X = 75;
  public static final int MESSAGE_Y = 100;
private static final int DEFAULT_WIDTH = 300;
  private static final int DEFAULT_HEIGHT = 200;

    @Override
    protected void paintComponent(Graphics g) {
        //super.paintComponent(g);
        g.drawString("Welcome!!!",MESSAGE_X,MESSAGE_Y);
    }

    @Override
    public Dimension getPreferredSize() {
     //   return super.getPreferredSize();
     return  new Dimension(DEFAULT_WIDTH,DEFAULT_HEIGHT);
    }
}
