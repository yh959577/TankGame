package Test;

import Test.TestFrame.GameFrame;
import Test.TestFrame.WelcomeFrame;

import javax.swing.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class TestMainClass {
 public static void main(String[] args){
     WelcomeFrame welcome=new WelcomeFrame();
     JFrame game=new GameFrame();
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

 }
}
