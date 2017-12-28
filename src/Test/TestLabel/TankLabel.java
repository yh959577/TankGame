package Test.TestLabel;

import javax.swing.*;
import java.awt.*;

public class TankLabel extends JLabel {
    private Point tankPosition;
    private Image tankImage;
    private int tankSide;
    private int tankSpeed = 1;

    public TankLabel(Dimension parentSize) {
        tankSide = (parentSize.height) / 10;
        tankImage = new ImageIcon("Image/tank_up.jpg").getImage();
        tankPosition = new Point(0, 0);
    }

    @Override
    protected void paintComponent(Graphics g) {
        //    super.paintComponent(g);
        //只画了初始位置????
        g.drawImage(tankImage, getParent().getSize().width / 2, getParent().getSize().height - (tankSide), tankSide, tankSide, null);
        System.out.println("paintComponentX:==" + tankPosition.x
                + "       paintComponentY:==" + tankPosition.y);

    }

    public void moveUp() {
        tankImage = new ImageIcon("Image/tank_up.jpg").getImage();
        // System.out.println("this y ===" + getY());
        // System.out.println("this heigth is====" + getParent().getSize().height);
        if (Math.abs(getY()) < (getParent().getSize().height - tankSide)) {
            tankPosition.y -= tankSpeed;
        }
        setLocation(tankPosition);
    }

    public void moveDown() {
        tankImage = new ImageIcon("Image/tank_down.jpg").getImage();
        if (getY() < 0) {
            tankPosition.y += tankSpeed;
        }
        setLocation(tankPosition);
    }

    public void moveLeft() {
        tankImage = new ImageIcon("Image/tank_left.jpg").getImage();
        if (Math.abs(getX()) < (getParent().getSize().width) / 2) {
            tankPosition.x -= tankSpeed;
        }
        setLocation(tankPosition);
    }

    public void moveRight() {
        tankImage = new ImageIcon("Image/tank_right.jpg").getImage();
        System.out.println("the parent width====" + (getParent().getSize().width) / 2);
        System.out.println("this X is=====" + getX());
        if (Math.abs(getX()) < (getParent().getSize().width / 2) - tankSide) {
            tankPosition.x += tankSpeed;
        }
        setLocation(tankPosition);
    }

    public int getTankSpeed() {
        return tankSpeed;
    }

    public void setTankSpeed(int tankSpeed) {
        this.tankSpeed = tankSpeed;
    }
}
