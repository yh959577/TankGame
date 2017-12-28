package Test.TestFrame;

import Test.TestComponent.GameComponent;
import Test.TestFrame.BaseFrame;
import Test.TestLabel.TankLabel;

import javax.swing.*;
import java.awt.*;

public class GameFrame extends BaseFrame {
private TankLabel playerTank;
private Thread enemyGenerateThread;

    public GameFrame(){
      super();
      getContentPane().setBackground(Color.WHITE);
      playerTank=new TankLabel(getSize());
      this.add(playerTank);
    }

    public void movePlayerTankUp(){
        playerTank.moveUp();
    }
    public void movePlayerTankDown(){
        playerTank.moveDown();
    }

    public void movePlayerTankLeft(){
        playerTank.moveLeft();
    }

    public void movePlayerTankRight(){
        playerTank.moveRight();
    }

}
