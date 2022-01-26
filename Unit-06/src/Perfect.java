//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Daniel Egorov

import static java.lang.System.*;

public class Perfect {
  private int number;

  //add constructors
  public Perfect() {
    this.setNum(0);
  }

  public Perfect(int num) {
    this.setNum(num);
  }

	//add a set method
  public void setNum(int num) {
    this.number = num;
  }
  
	public boolean isPerfect() {
    int MAX = (int)Math.floor(Math.sqrt(this.number));
    int divisorSum = 1;

    int i = 2;
    while (i <= MAX) {
      if (this.number % i == 0) {
        divisorSum += i;
        divisorSum += this.number / i;
      }
      i++;
    }
    
		return divisorSum == this.number;
	}

	//add a toString	
  public String toString() {
    if (this.isPerfect())
      return this.number + " is perfect.";
    else  
      return this.number + " is not perfect.";
  }
	
}