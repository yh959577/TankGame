package Test.TestFrame;

import Test.TestComponent.GameComponent;
import Test.TestFrame.BaseFrame;

import javax.swing.*;
import java.awt.*;

public class GameFrame extends BaseFrame {

    public GameFrame(){
      super();
      getContentPane().setBackground(Color.WHITE);
    }

    class TankPanel extends JPanel{

        @Override
        public void paintComponents(Graphics g) {
            super.paintComponents(g);
            int width=this.getParent().getSize().width;
            int tankSide=width/10;


        }
    }

}
