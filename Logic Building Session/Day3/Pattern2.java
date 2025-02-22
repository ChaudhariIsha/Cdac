class Pattern2{
 public static void main(String args[]){

   
 int i ,j ,r=5,n;
 
 for(i=1 ; i<=r ;i++){
             for(j= 1; j<=i ;j++){
                  System.out.print(i);
                    if(j<i){
                     System.out.print("*");
                             }
                  }
                  System.out.println();
           }

 for(i=r ; i>=1;i--){
             for(j= 1; j<=i ;j++){
                  System.out.print(i);
                    if(j<i){
                     System.out.print("*");
                             }
                  }
                  System.out.println();
           }

 









}}