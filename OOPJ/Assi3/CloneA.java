class CloneA{
 public static void main(String args[]){
 
 
 int arr[]={10,20,30};
 int clonearr[] = arr.clone();
 
 System.out.println(arr == clonearr);
 System.out.println(arr[1] == clonearr[1]);
 
 for(int x : arr){
  System.out.println(x);
  
 }
 System.out.println("-------------------");
  for(int x : clonearr){
  System.out.println(x);
  
 }

 
 
 }}