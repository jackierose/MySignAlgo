import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class wordParser{


  public static String[] wordSplit(String fileName) {
    File file;
    Scanner inputFile = null;
    try {
      file = new File(fileName);
      inputFile = new Scanner(file);
    } catch(FileNotFoundException e) {
      System.out.println("You suck");
    }

    String line = inputFile.nextLine();
    System.out.println(line);

    String[] wordBank = line.split(" ");
    return wordBank;
  }

  public static void main(String[] args) {
    System.out.println("Hello this is the beginning of this program.");
    if(args.length == 0) {
      System.out.println("There was not file inputed.");

    }
    String fileName = args[0];
    System.out.println("You have inputed the following file: " + fileName);
    String [] wordBank = wordSplit(fileName);


  }
}
