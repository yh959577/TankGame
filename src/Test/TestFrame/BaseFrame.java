package Test.TestFrame;

import Test.Const.ConstString;

import javax.swing.*;
import java.awt.*;

 class BaseFrame extends JFrame {

    BaseFrame(){
       Dimension screenDimension=Toolkit.getDefaultToolkit().getScreenSize();
       int height=(int) screenDimension.getHeight()/2;
       int width=(int)screenDimension.getWidth()/2;

       setSize(width,height);
       setTitle(ConstString.gameTitle);
       setLocationByPlatform(true);
       setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }


}
