//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Daniel Egorov

public class Grid {

  private String[][] grid;

  //load vals into the rows x cols grid randomly
  public Grid(int rows, int cols, String[] vals) {
    this.grid = new String[rows][cols];
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        int rand = (int) (Math.random() * vals.length);
        this.grid[i][j] = vals[rand];
      }
    }
  }

  //find out which of the vals occurs the most
  public String findMax(String[] vals) {
    String highest = vals[0];
    for (String val : vals) if (this.countVals(val) > this.countVals(highest)) highest = val;
    return highest + " occurs the most";
  }

  //returns a count of how many times val occurs in the matrix
  private int countVals(String val) {
    int count = 0;
    for (int i = 0; i < this.grid.length; i++) {
      for (int j = 0; j < this.grid[i].length; j++) {
        if (this.grid[i][j].equals(val)) count++;
      }
    }
    return count;
  }

  //display the grid
  public String toString() {
    String output = "";

    for (int i = 0; i < this.grid.length; i++) {
      for (int j = 0; j < this.grid[i].length; j++) {
        output += this.grid[i][j] + " ";
      }
      output += "\n";
    }
    return output;
  }
}
