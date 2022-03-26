//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Daniel Egorov

import java.awt.Color;
import java.awt.Graphics;

public class Paddle extends Block {

  //instance variables
  private int speed;

  public Paddle() {
    super(10, 10);
    this.setSpeed(5);
  }

  //add the other Paddle constructors
  public Paddle(int x, int y) {
    super(x, y);
    this.setSpeed(5);
  }

  public Paddle(int x, int y, int speed) {
    super(x, y);
    this.setSpeed(speed);
  }

  public Paddle(int x, int y, int width, int height) {
    super(x, y, width, height);
    this.setSpeed(5);
  }

  public Paddle(int x, int y, int width, int height, int speed) {
    super(x, y, width, height);
    this.setSpeed(speed);
  }

  public Paddle(int x, int y, int width, int height, Color color) {
    super(x, y, width, height, color);
    this.setSpeed(5);
  }

  public Paddle(int x, int y, int width, int height, Color color, int speed) {
    super(x, y, width, height, color);
    this.setSpeed(speed);
  }

  public void moveUpAndDraw(Graphics window) {
    this.draw(window, Color.white);
    this.setY(this.getY() - this.speed);
    this.draw(window);
  }

  public void moveDownAndDraw(Graphics window) {
    this.draw(window, Color.white);
    this.setY(this.getY() + this.speed);
    this.draw(window);
  }

  public void setSpeed(int speed) {
    this.speed = speed;
  }

  //add get methods
  public int getSpeed() {
    return this.speed;
  }

  //add a toString() method
  public String toString() {
    return super.toString() + " " + this.speed;
  }
}
