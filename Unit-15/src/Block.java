//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Daniel Egorov

import java.awt.Color;
import java.awt.Graphics;

public class Block implements Locatable {

  private int xPos;
  private int yPos;
  private int width;
  private int height;

  private Color color;

  public Block() {
    this(100, 150, 10, 10, Color.BLACK);
  }

  //add other Block constructors - x , y , width, height, color
  public Block(int x, int y) {
    this(x, y, 10, 10, Color.BLACK);
  }

  public Block(int x, int y, int width, int height) {
    this.setPos(x, y);
    this.setDimensions(width, height);
    this.setColor(Color.BLACK);
  }

  public Block(int x, int y, int width, int height, Color color) {
    this(x, y, width, height);
    this.setColor(color);
  }

  //add the other set methods
  public void setPos(int x, int y) {
    this.setX(x);
    this.setY(y);
  }

  public void setX(int x) {
    this.xPos = x;
  }

  public void setY(int y) {
    this.yPos = y;
  }

  public void setDimensions(int width, int height) {
    this.setWidth(width);
    this.setHeight(height);
  }

  public void setWidth(int width) {
    this.width = width;
  }

  public void setHeight(int height) {
    this.height = height;
  }

  public void setColor(Color col) {
    this.color = col;
  }

  public void draw(Graphics window) {
    //uncomment after you write the set and get methods
    window.setColor(color);
    window.fillRect(getX(), getY(), getWidth(), getHeight());
  }

  public void draw(Graphics window, Color col) {
    window.setColor(col);
    window.fillRect(getX(), getY(), getWidth(), getHeight());
  }

  public boolean equals(Object obj) {
    if (!(obj instanceof Block)) return false;
    Block other = (Block) obj;
    return (
      other.getX() == this.getX() &&
      other.getY() == this.getY() &&
      other.getWidth() == this.getWidth() &&
      other.getHeight() == this.getHeight() &&
      other.getColor().equals(this.getColor())
    );
  }

  //add the other get methods
  public int getX() {
    return this.xPos;
  }

  public int getY() {
    return this.yPos;
  }

  public int getWidth() {
    return this.width;
  }

  public int getHeight() {
    return this.height;
  }

  public Color getColor() {
    return this.color;
  }

  //add a toString() method  - x , y , width, height, color
  public String toString() {
    return (this.xPos + " " + this.yPos + " " + this.width + " " + this.height + " " + this.color);
  }
}
