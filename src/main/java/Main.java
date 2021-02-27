import java.util.Scanner;

public class Main {

  public static void main(String[] args){

    Calculator calc = new Calculator();


    while(true) {
      System.out.print("Enter a command: ");
      Scanner scanner = new Scanner(System.in);
      String input = scanner.nextLine();
      String[] command = input.split(" ");

      if (command[0].equals("add")){
        System.out.println("Output: " + calc.add(Integer.parseInt(command[1]), Integer.parseInt(command[2])));
      }
      else if (command[0].equals("subtract")){
        System.out.println("Output: " + calc.subtract(Integer.parseInt(command[1]), Integer.parseInt(command[2])));

      }
      else if (command[0].equals("multiply")){
        System.out.println("Output: " + calc.multiply(Integer.parseInt(command[1]), Integer.parseInt(command[2])));

      }
      else if (command[0].equals("divide")){
        System.out.println("Output: " + calc.divide(Integer.parseInt(command[1]), Integer.parseInt(command[2])));

      }
      else if (command[0].equals("fibonacci")){
        System.out.println("Output: " + calc.fibonacciNumberFinder(Integer.parseInt(command[1])));

      }
      else if (command[0].equals("binary")){
        System.out.println("Output: " + calc.intToBinaryNumber(Integer.parseInt(command[1])));

      }
      else if (command[0].equals("exit")){
        break;
      }
      else {
        System.out.println("Invalid command");
      }
    }
  }
}
