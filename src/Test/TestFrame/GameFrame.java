package Test.TestFrame;

import Test.TestComponent.GameComponent;
import Test.TestFrame.BaseFrame;
import Test.TestLabel.TankLabel;

import javax.swing.*;
import java.awt.*;

public class GameFrame extends BaseFrame {
private TankLabel playerTank;

    public GameFrame(){
      super();
      getContentPane().setBackground(Color.WHITE);
      playerTank=new TankLabel(getSize());
      this.add(playerTank);
    }

    public void moveTankUp(){
        playerTank.moveUp();
    }
    public void moveTankDown(){
        playerTank.moveDown();
    }

    public void moveTankLeft(){
        playerTank.moveLeft();
    }

    public void moveTankRight(){
        playerTank.moveRight();
    }


//    class TankLabel extends JLabel{
//          Image image=new ImageIcon("Image/tank.jpg").getImage();
//
//        @Override
//        protected void paintComponent(Graphics g) {
//            super.paintComponent(g);
//            Dimension parentSize=this.getParent().getSize();
//            int width=parentSize.width;
//            int height=parentSize.height;
//            int tankSide=width/10;
//            g.drawImage(image,0,height-tankSide,tankSide,tankSide,null);
//            moveThisTank(g);
//        }
  //  }

    public void  moveThisTank(Graphics graphics){

    }

}
