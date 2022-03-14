//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Daniel Egorov

import static java.lang.System.*;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class GridRunner {

  public static void main(String args[]) throws IOException {
    String[] vals = new String[] { "a", "b", "c", "x", "2", "7", "9" };
    Grid grid = new Grid(20, 20, vals);
    System.out.println(grid);
    System.out.println(grid.findMax(vals));

    System.out.println();

    grid = new Grid(10, 10, vals);
    System.out.println(grid);
    System.out.println(grid.findMax(vals));
  }
}
