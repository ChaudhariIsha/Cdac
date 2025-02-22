class Pattern10{
 public static void main(String args[]){

   
 int i ,j ,r=5,n;
 
 for(i=1 ; i<=r ;i++){
             int odd = 1;
            for(j= 1; j<=i;j++){
            
                  System.out.print(odd);

                    if(j<i){
                     System.out.print("*");
                            }
                    odd = odd+2;
     
                }
                      
            System.out.println();


 }
 









}}