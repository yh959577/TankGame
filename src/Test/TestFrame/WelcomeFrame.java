package Test.TestFrame;

import Test.Const.Const;
import Test.TestComponent.WelcomeComponent;
import Test.TestFrame.BaseFrame;

import javax.swing.*;
import java.awt.*;

public class WelcomeFrame extends BaseFrame {
  public WelcomeFrame(){
      super();
      drawBackGround();
  }

  public void drawBackGround(){
      this.add(new welcomePanel());
  }
   class welcomePanel extends JPanel{
      Image image=new ImageIcon("Image/background.jpg").getImage();
       @Override
       protected void paintComponent(Graphics g) {
           super.paintComponent(g);
           Dimension size=this.getParent().getSize();
           g.drawImage(image,0,0,size.width,size.height,null);
           g.drawString("start game",size.width/2,size.height);
       }
   }














}
