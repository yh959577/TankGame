package Test.TestLabel;

import javax.swing.*;
import java.awt.*;

abstract class Tank extends JLabel {
    Point tankPosition;
    Image tankImage;
    int tankSide;
    int tankSpeed = 1;

    abstract void moveUp();

    abstract void moveDown();

    abstract void moveRight();

    abstract void moveLeft();

    public void setTankImage(String imagePath){
        tankImage=new ImageIcon(imagePath).getImage();
    };

    public void setTankSide(int tankSide){
        this.tankSide=tankSide;
    }

    public int getTankSide(){
        return tankSide;
    }

    public void setTankSpeed(int tankSpeed) {
        this.tankSpeed = tankSpeed;
    }

    public int getTankSpeed() {
        return tankSpeed;
    }

}
