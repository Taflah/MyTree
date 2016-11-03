
package game;

import java.util.*;

public class Jar {
    
    private String mItemName;
    private int mMaxNumber;
    private int mNumItem;
    private int mTries;
    
    public Jar(String itemName, int maxNumber ){
      mItemName = itemName;
      mMaxNumber = maxNumber;
      Random random = new Random();
      mNumItem = random.nextInt(maxNumber) + 1;
    }
    
 public boolean makeGuess(int guess) {
	if (guess <= mMaxNumber && guess > 0) {
	 mTries++;
	 if (guess > mNumItem)
	   System.out.println("Your guess is too high");
	    else if (guess < mNumItem)
	       System.out.println("Your guess is too low");}
            else if (guess > mNumItem) {
	       System.out.printf("Your guess must be less than or equal to %d!%n",mMaxNumber);}
            else if (guess == 0) {
	       System.out.println("there is at least one " + getmItemName());
		} 
		return guess == mNumItem;
	}

    public int getmTries() {
        return mTries;
    }

    public String getmItemName() {
        return mItemName;
    }

    public int getmMaxNumber() {
        return mMaxNumber;
    }

    public int getmNumItem() {
        return mNumItem;
    }
    
  
}
