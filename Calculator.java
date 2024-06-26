import java.util.Scanner;

public class Calculator {
    Scanner scanner = new Scanner(System.in);
    String[] methods = {"add","subtract","multiply","divide"};

    public  void  checkValues(){
        // finds which method to use
        System.out.println("Name function, Options are:");
        for(int i =0;i<methods.length;i++){
            System.out.println(methods[i]);
        }
        String function = scanner.next();
        String function1 = function.toLowerCase();
        String function_final = function1.trim();
        switch (function_final){
            case "add":
                add1();
                break;
            case "subtract":
                subtract1();
                break;
            case "multiply":
                multiply1();
                break;
            case "divide":
                divide1();
                break;
        }


    }
    // adds 2 numbers can be double/int
    public  void add1(){
        System.out.println("Addend 1:");
        double a = scanner.nextDouble();
        System.out.println("Addend 2:");
        double b = scanner.nextDouble();
        double addedValue = a + b;
        System.out.println("Added value/sum = "+addedValue);
    }
  public void subtract1(){
      System.out.println("Minuend:");
      double a = scanner.nextDouble();
      System.out.println("Subtrahend:");
      double b = scanner.nextDouble();
      double subtractedValue = a - b;
      System.out.println("Subtracted value/difference = "+ subtractedValue);
  }
    public void multiply1(){
        System.out.println("Multiplicand:");
        double a = scanner.nextDouble();
        System.out.println("Multiplier:");
        double b = scanner.nextDouble();
        double subtractedValue = a * b;

        System.out.println("Multiplied value/Product = "+ subtractedValue);
    }
    public void divide1(){
        System.out.println("Dividend:");
        double a = scanner.nextDouble();
        System.out.println("Divisor:");
        double b = scanner.nextDouble();
        double subtractedValue = a / b;
        System.out.println("Divided value/Quotient = "+ subtractedValue);
    }
}
