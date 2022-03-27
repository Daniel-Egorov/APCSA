//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Daniel Egorov

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

class SpeedUpBall extends Ball {

  //instance variables
  private int xSpeedIncrease;
  private int ySpeedIncrease;

  public SpeedUpBall() {
    super();
    xSpeedIncrease = 3;
    ySpeedIncrease = 1;
  }

  public SpeedUpBall(int x, int y) {
    super(x, y);
    xSpeedIncrease = 3;
    ySpeedIncrease = 1;
  }

  public SpeedUpBall(int x, int y, Color col) {
    super(x, y, col);
    xSpeedIncrease = 3;
    ySpeedIncrease = 1;
  }

  public SpeedUpBall(int x, int y, int xSpd, int ySpd) {
    super(x, y, xSpd, ySpd);
    xSpeedIncrease = 3;
    ySpeedIncrease = 1;
  }

  public SpeedUpBall(int x, int y, int wid, int ht, int xSpd, int ySpd) {
    super(x, y, wid, ht, xSpd, ySpd);
    xSpeedIncrease = 3;
    ySpeedIncrease = 1;
  }

  public SpeedUpBall(int x, int y, int wid, int ht, Color col, int xSpd, int ySpd) {
    super(x, y, wid, ht, col, xSpd, ySpd);
    xSpeedIncrease = 3;
    ySpeedIncrease = 1;
  }

  public void setXSpeed(int xSpd) {
    if (xSpd < 0) {
      super.setXSpeed(xSpd - xSpeedIncrease);
    } else if (xSpd > 0) {
      super.setXSpeed(xSpd + xSpeedIncrease);
    } else {
      super.setXSpeed(xSpd);
    }
  }

  public void setYSpeed(int ySpd) {
    if (ySpd < 0) {
      super.setYSpeed(ySpd - ySpeedIncrease);
    } else if (ySpd > 0) {
      super.setYSpeed(ySpd + ySpeedIncrease);
    } else {
      super.setYSpeed(ySpd);
    }
  }
}
