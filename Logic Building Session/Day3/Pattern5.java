class Pattern5{
 public static void main(String args[]){

   int rows = 5, k = 0;

    for (int i = 1; i <= rows; ++i, k = 0) {
     
      

      while (k != 2 * i - 1) {
        System.out.print("*");
        ++k;
      }

      System.out.println();}
}}