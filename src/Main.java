import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

  private static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) throws IOException {
    do {
      System.out.println("Enter a line item. Type 'exit' to quit:");
      String lineItem = scanner.nextLine();

      if (lineItem.equalsIgnoreCase("exit"))
        exitProgram(0);

      check(lineItem);
    } while ((scanner.hasNextLine()));
  }

  private static void check(String input) {
    Arrays.asList(RegexPattern.values()).forEach(regexPattern -> printMatchResult(input, regexPattern));
  }

  private static void printMatchResult(String input, RegexPattern regexPattern) {
    String matchResult = (input.matches(regexPattern.getPattern()) ? "Match on:" : "No match on:") + "\t" + regexPattern.toString();
    System.out.println(matchResult);
  }


  private static void exitProgram(int status) {
    System.out.println("Exiting program...");
    scanner.close();
    System.exit(status);
  }
}
