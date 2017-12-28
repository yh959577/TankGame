package Test.TestLabel;

import Test.Const.Const;

import javax.swing.*;
import java.awt.*;

import Test.Const.Const;

public class PlayerTank extends Tank {
    public PlayerTank(Dimension parentSize) {
        tankSide = (parentSize.height) / 10;
        tankImage = new ImageIcon(Const.tankImageUp).getImage();
        tankPosition = new Point(0, 0);
    }

    @Override
    protected void paintComponent(Graphics g) {
        g.drawImage(tankImage, getParent().getSize().width / 2,
                getParent().getSize().height - (tankSide),
                tankSide, tankSide, null);
    }

    @Override
    void moveUp() {
        if (Math.abs(getY()) < (getParent().getSize().height - tankSide)) {
            tankPosition.y -= tankSpeed;
        }
        setTankImage(Const.tankImageUp);
        setLocation(tankPosition);
    }

    @Override
    void moveDown() {
        if (getY() < 0) {
            tankPosition.y += tankSpeed;
        }
        setTankImage(Const.tankImageDown);
        setLocation(tankPosition);
    }

    @Override
    void moveRight() {
        if (Math.abs(getX()) < (getParent().getSize().width / 2) - tankSide) {
            tankPosition.x += tankSpeed;
        }
        setTankImage(Const.tankImageRight);
        setLocation(tankPosition);
    }

    @Override
    void moveLeft() {
        if (Math.abs(getX()) < (getParent().getSize().width) / 2) {
            tankPosition.x -= tankSpeed;
        }
        setTankImage(Const.tankImageLeft);
        setLocation(tankPosition);
    }
}
