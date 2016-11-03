
package game;

import java.util.*;

public class Prompter {
    
    private String name;
    private int max;
    private int guess;
    Scanner input = new Scanner(System.in);
    
     public void play(){
     Administrator();
     player();
     }
    
     public void Administrator(){
     System.out.println("Administrator");
     System.out.println("What type of item? ");
     name = input.nextLine();
     System.out.println("What is the maximum number of items");
     max = input.nextInt();
     System.out.println("\n ================== \n");
     while (max < 0){
        System.out.println("please enter a positive numper");
        max = input.nextInt();    
     }}
     
     public void player(){ 
      Jar jar = new Jar(name,max);
      System.out.println("Player");
      System.out.printf("Please guess how many %ss in the jar from 1 to %d \n"
                        ,jar.getmItemName(), jar.getmMaxNumber());
      boolean correct = false;
      while(!correct) {
          System.out.println("Guess #"+ (jar.getmTries()+1));
          guess = input.nextInt();
          correct = jar.makeGuess(guess);
        }
        if(guess == jar.getmNumItem()){
           System.out.printf("You got it in %d attempts \n" , jar.getmTries());
        }
      }
     
     
    
}
