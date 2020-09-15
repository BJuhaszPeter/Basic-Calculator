// ------------------ A Basic Calculator -----------------

public class Calculator{
// This is the constructor:
    public Calculator(){

    }
// These are the methods:
    public int add(int a, int b){
      return a + b;
    }

    public int subtract(int a, int b){
      return a - b;
    }

    public int multiply(int a, int b){
      return a * b;
    }

    public int divide(int a, int b){
      return a / b;
    }

    public int modulo(int a, int b){
      return a % b;
    }
// This is the main method:
  public static void main(String[] args){
    Calculator myCalculator = new Calculator();
    System.out.println(myCalculator.add(5,7));
    System.out.println(myCalculator.subtract(45,11));

}

}