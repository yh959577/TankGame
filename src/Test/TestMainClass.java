package Test;

import Test.TestFrame.GameFrame;
import Test.TestFrame.WelcomeFrame;
import Test.TestLabel.PlayerTank;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import static java.awt.event.KeyEvent.*;

public class TestMainClass {
 public static void main(String[] args){
     WelcomeFrame welcome=new WelcomeFrame();
     GameFrame game=new GameFrame();
     welcome.setVisible(true);
     welcome.addKeyListener(new KeyListener() {
         @Override
         public void keyTyped(KeyEvent e) {

         }

         @Override
         public void keyPressed(KeyEvent e) {
            if (e.getKeyCode()==KeyEvent.VK_ENTER){
               // System.out.println("Enter!Enter!");
                welcome.setVisible(false);
                game.setVisible(true);
            }
         }

         @Override
         public void keyReleased(KeyEvent e) {

         }
     });

     game.addKeyListener(new KeyListener() {
         @Override
         public void keyTyped(KeyEvent e) {

         }

         @Override
         public void keyPressed(KeyEvent e) {
                if (e.getKeyCode()==VK_UP||e.getKeyCode()==VK_W){
                      game.movePlayerTankUp();
                } if (e.getKeyCode()==VK_DOWN||e.getKeyCode()==VK_S){
                 game.movePlayerTankDown();
                }
                if (e.getKeyCode()==VK_LEFT||e.getKeyCode()==VK_A){
                    game.movePlayerTankLeft();
                }
                if (e.getKeyCode()==VK_RIGHT||e.getKeyCode()==VK_D){
                    game.movePlayerTankRight();
                }
         }

         @Override
         public void keyReleased(KeyEvent e) {

         }
     });

 }
}
