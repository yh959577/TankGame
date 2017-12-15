package Test.TestComponent;

import javax.swing.*;
import java.awt.*;

public class GameComponent extends JComponent {

    @Override
    public void paintComponents(Graphics g) {
        //super.paintComponents(g);
        g.drawString("this is gameComponent",0,0);
    }
}
