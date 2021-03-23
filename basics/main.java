import java.util.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;



public class main {
  public static void main(String[] args) {
    // pluralizing test
    int dogCount = 2;
    System.out.println("I own " + " " + pluralize("dog", dogCount) + ".");

    int catCount = 2;
    System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

    int turtleCount = 0;
    System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");

    // coin flip test
    flipNHeads(1);

    // clock test
    clock();

  }

  public static String pluralize(String word, int number) {
    if (number != 1) {
      return word + 's';
    } else{
      return word;
    }
  }

  public static void flipNHeads(int n) {
    int totalFlips = 0;
    int consecutiveHeads = 0;

    while (consecutiveHeads < n) {
      totalFlips++;
           if (Math.random() >= 0.5) {
        consecutiveHeads++;
        System.out.println("heads");
      } else {
        consecutiveHeads = 0;
        System.out.println("tails");
      }
    }
    System.out.println("It took " + totalFlips + " flips to flip " + n + " " + pluralize("head", n) + " in a row.");
    }
      public static void clock() {
    int currentSecond;
    LocalDateTime now;
    int prevSecond = LocalDateTime.now().getSecond();

    while (true) {
      now = LocalDateTime.now();
      currentSecond = now.getSecond();
      if (currentSecond == prevSecond) {
        continue;
      } else {
        System.out.println(now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        prevSecond = currentSecond;
      }
    }
  }
  }
}