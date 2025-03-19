class Assi3_8{
	public static void main(String args[]){
		int n = 6 ;//length of array
		int m = 6 ; // lenght of array
		
		int [] arr1= {1,1,2,3,5,8};
		int [] arr2={2,3,4,5,7,8};
		
		int i = n-1;
		int j = m-1;
		int k = n+m - 1;
		
		while(i>=0 && j>=0){
			
			if(arr1[i]>arr2[j]){
				arr1[k]=arr1[i];
				i--;
				
			}
			else{
				arr2[k]=arr2[j];
				j--;
			}
			k--;
		}
		 while (j >= 0) {
            arr1[k] = arr2[j];
            j--;
            k--;
        }
	for(int x : arr1){
		System.out.println(x +" ");
	}
    System.out.println();

		
		
		
		
		
		
	}}