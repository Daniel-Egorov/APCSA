//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Daniel Egorov

import java.io.*;
import java.util.*;

public class WordSearch {

  private String[][] m;

  public WordSearch(int size, String str) {
    this.m = new String[size][size];
    for (int i = 0; i < this.m.length; i++) {
      for (int j = 0; j < this.m[i].length; j++) {
        int index = i * size + j;
        this.m[i][j] = str.substring(index, index + 1);
      }
    }
  }

  public boolean isFound(String word) {
    for (int i = 0; i < this.m.length; i++) {
      for (int j = 0; j < this.m[i].length; j++) {
        if (
          this.checkUp(word, i, j) ||
          this.checkDown(word, i, j) ||
          this.checkLeft(word, i, j) ||
          this.checkRight(word, i, j) ||
          this.checkDiagDownLeft(word, i, j) ||
          this.checkDiagDownRight(word, i, j) ||
          this.checkDiagUpLeft(word, i, j) || 
          this.checkDiagUpRight(word, i, j)
        ) return true;
      }
    }
    return false;
  }

  public boolean checkRight(String w, int r, int c) {
    if (this.tooLongRight(w, r, c)) return false;
    for (int i = 0; i < w.length(); i++) if (
      !w.substring(i, i + 1).equals(this.m[r][c + i])
    ) return false;
    return true;
  }

  public boolean checkLeft(String w, int r, int c) {
    if (this.tooLongLeft(w, r, c)) return false;
    for (int i = 0; i < w.length(); i++) if (
      !w.substring(i, i + 1).equals(this.m[r][c - i])
    ) return false;
    return true;
  }

  public boolean checkUp(String w, int r, int c) {
    if (this.tooLongUp(w, r, c)) return false;
    for (int i = 0; i < w.length(); i++) if (
      !w.substring(i, i + 1).equals(this.m[r - i][c])
    ) return false;
    return true;
  }

  public boolean checkDown(String w, int r, int c) {
    if (this.tooLongDown(w, r, c)) return false;
    for (int i = 0; i < w.length(); i++) if (
      !w.substring(i, i + 1).equals(this.m[r + i][c])
    ) return false;
    return true;
  }

  public boolean checkDiagUpRight(String w, int r, int c) {
    if (this.tooLongUp(w, r, c) || this.tooLongRight(w, r, c)) return false;
    for (int i = 0; i < w.length(); i++) if (
      !w.substring(i, i + 1).equals(this.m[r - i][c + i])
    ) return false;
    return true;
  }

  public boolean checkDiagUpLeft(String w, int r, int c) {
    if (this.tooLongUp(w, r, c) || this.tooLongLeft(w, r, c)) return false;
    for (int i = 0; i < w.length(); i++) if (
      !w.substring(i, i + 1).equals(this.m[r - i][c - i])
    ) return false;
    return true;
  }

  public boolean checkDiagDownLeft(String w, int r, int c) {
    if (this.tooLongDown(w, r, c) || this.tooLongLeft(w, r, c)) return false;
    for (int i = 0; i < w.length(); i++) if (
      !w.substring(i, i + 1).equals(this.m[r + i][c - i])
    ) return false;
    return true;
  }

  public boolean checkDiagDownRight(String w, int r, int c) {
    if (this.tooLongDown(w, r, c) || this.tooLongRight(w, r, c)) return false;
    for (int i = 0; i < w.length(); i++) if (
      !w.substring(i, i + 1).equals(this.m[r + i][c + i])
    ) return false;
    return true;
  }

  private boolean tooLongRight(String w, int r, int c) {
    // if the word is longer than there is space to the right
    if (this.m[r].length - w.length() < c) return true;
    return false;
  }

  private boolean tooLongLeft(String w, int r, int c) {
    // if the word is longer than there is space to the left
    if (c - w.length() + 1 < 0) return true;
    return false;
  }

  private boolean tooLongUp(String w, int r, int c) {
    // if the word is longer than there is space upwards
    if (r - w.length() + 1 < 0) return true;
    return false;
  }

  private boolean tooLongDown(String w, int r, int c) {
    // if the word is longer than there is space downwards
    if (this.m.length - w.length() < r) return true;
    return false;
  }

  public String toString() {
    String output = "";
    for (int i = 0; i < this.m.length; i++) {
      for (int j = 0; j < this.m[i].length; j++) {
        output += this.m[i][j] + " ";
      }
      output += "\n";
    }
    return output;
  }
}
