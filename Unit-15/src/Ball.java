//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Daniel Egorov

import java.awt.Color;
import java.awt.Graphics;

public class Ball extends Block implements Collidable {

  private int xSpeed;
  private int ySpeed;

  public Ball() {
    super(200, 200);
    this.setSpeed(3, 1);
  }

  //add the other Ball constructors
  public Ball(int x, int y) {
    super(x, y);
    this.setSpeed(3, 1);
  }

  public Ball(int x, int y, Color color) {
    super(x, y);
    this.setSpeed(3, 1);
    this.setColor(color);
  }

  public Ball(int x, int y, int width, int height) {
    super(x, y, width, height);
    this.setSpeed(3, 1);
  }

  public Ball(int x, int y, int width, int height, Color color) {
    super(x, y, width, height, color);
    this.setSpeed(3, 1);
  }

  public Ball(int x, int y, int width, int height, Color color, int xSpeed, int ySpeed) {
    super(x, y, width, height, color);
    this.setSpeed(xSpeed, ySpeed);
  }

  //add the set methods
  public void setSpeed(int x, int y) {
    this.setXSpeed(x);
    this.setYSpeed(y);
  }

  public void setXSpeed(int x) {
    this.xSpeed = x;
  }

  public void setYSpeed(int y) {
    this.ySpeed = y;
  }

  public void moveAndDraw(Graphics window) {
    //draw a white ball at old ball location
    this.draw(window, Color.WHITE);

    setX(getX() + xSpeed);
    //setY
    setY(getY() + ySpeed);

    //draw the ball at its new location
    this.draw(window);
  }

  public boolean equals(Object obj) {
    if (!(obj instanceof Ball)) return false;
    Ball other = (Ball) obj;
    return (
      other.getX() == this.getX() &&
      other.getY() == this.getY() &&
      other.getWidth() == this.getWidth() &&
      other.getHeight() == this.getHeight() &&
      other.getColor().equals(this.getColor()) &&
      other.getXSpeed() == this.getXSpeed() &&
      other.getYSpeed() == this.getYSpeed()
    );
  }

  //add the get methods
  public int getXSpeed() {
    return this.xSpeed;
  }

  public int getYSpeed() {
    return this.ySpeed;
  }

  public boolean didCollideLeft(Object obj) {
    if (!(obj instanceof Block)) return false;
    Block other = (Block) obj;
    if (!(this.getX() <= other.getX() + other.getWidth())) return false;
    if (
      !(this.getY() + this.getHeight() >= other.getY() && this.getY() <= other.getY() + other.getHeight())
    ) return false;
    return true;
  }

  public boolean didCollideRight(Object obj) {
    if (!(obj instanceof Block)) return false;
    Block other = (Block) obj;
    if (!(this.getX() + this.getWidth() >= other.getX())) return false;
    if (
      !(this.getY() + this.getHeight() >= other.getY() && this.getY() <= other.getY() + other.getHeight())
    ) return false;
    return true;
  }

  public boolean didCollideTop(Object obj) {
    if (!(obj instanceof Block)) return false;
    Block other = (Block) obj;
    if (!(this.getY() <= other.getY() + other.getHeight())) return false;
    if (
      !(this.getX() >= other.getX() || this.getX() + this.getWidth() <= other.getX() + other.getWidth())
    ) return false;
    return true;
  }

  public boolean didCollideBottom(Object obj) {
    if (!(obj instanceof Block)) return false;
    Block other = (Block) obj;
    if (!(this.getY() + this.getHeight() >= other.getY())) return false;
    if (
      !(this.getX() <= other.getX() + other.getWidth() || this.getX() + this.getWidth() >= other.getX())
    ) return false;
    return true;
  }

  //add a toString() method
  public String toString() {
    return super.toString() + " " + this.xSpeed + " " + this.ySpeed;
  }
}
