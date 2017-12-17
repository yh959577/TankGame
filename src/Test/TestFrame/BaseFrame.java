package Test.TestFrame;

import Test.Const.Const;

import javax.swing.*;
import java.awt.*;

 class BaseFrame extends JFrame {

    BaseFrame(){
       setSize(Const.frameWidth,Const.frameHeight);
       setTitle(Const.gameTitle);
       setLocationByPlatform(true);
       setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
       setResizable(false);
    }


}
