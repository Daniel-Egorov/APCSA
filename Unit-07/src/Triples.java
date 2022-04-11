//(c) A+ Computer Science
// www.apluscompsci.com
//Name - Daniel Egorov

public class Triples {

  private int number;

  public Triples() {
    this.setNum(0);
  }

  public Triples(int num) {
    this.setNum(num);
  }

  public void setNum(int num) {
    this.number = num;
  }

  private int greatestCommonFactor(int a, int b, int c) {
    int max = 0;
    for (int i = 1; i <= c; i++) {
      if (a % i == 0 && b % i == 0 && c % i == 0) max = i;
    }
    return max;
  }

  public String toString() {
    String output = "";
    for (int a = 1; a <= this.number; a++) {
      for (int b = 1; b <= this.number; b++) {
        if ( // if both a and b are even or if both a and b are even, skip that combo
          (a % 2 == 0 && b % 2 == 0) || (a % 2 == 1 && b % 2 == 1)
        ) continue;
        if ( // skip any triplets that have been saved (ie 3 4 5, ignore 4 3 5)
          output.contains("" + b + " " + a)
        ) continue;
        for (int c = 1; c <= this.number; c++) {
          // if c is even, skip that combo
          if (c % 2 == 0) continue;
          // if GCF of a, b, c is not 1, skip combo
          if (this.greatestCommonFactor(a, b, c) != 1) continue;
          if (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)) output += a + " " + b + " " + c + "\n";
        }
      }
    }
    return output + "\n";
  }
}
