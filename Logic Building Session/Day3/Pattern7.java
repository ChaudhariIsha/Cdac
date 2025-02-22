class Pattern7{
 public static void main(String args[]){

   int r = 5, k = 0;

    for (int i = 1; i <= r; i++, k = 0) {
     
      

      while (k != 2 * i - 1) {
        System.out.print("*");
        ++k;
      }

      System.out.println();}


    for (int i = r; i >=1; i--, k = 0) {
     
      

      while (k != 2 * i - 1) {
        System.out.print("*");
        ++k;
      }

      System.out.println();}


}}