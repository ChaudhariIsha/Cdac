public class Example {
    public static void main(String[] args) {
        int i = 5;

       System.out.println("Value of i Before operations: " + i);
        int result = ++i + i-- + --i;

      System.out.println("Value of i after operations: " + i);
    
        System.out.println("Result of expression: " + result);
    }
}
