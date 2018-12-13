
package selection.sort;


public class SelectionSort {

    
   
    public static void main(String[] args) {
        
       
      int[] arr = {45,55,2,5,3,8,4,7,1,5,4,8,9,12,6,8};
        for(int i=1; i<=arr.length; i++ ){
            for(int j=0;j<arr.length-1;j++){
              if(arr[j+1]<arr[j]){
                  int temp = arr[j];
                  arr[j] = arr[j+1];
                  arr[j+1] = temp;
            }
            }
        }
        for(int d= 0; d<arr.length; d++){
                    System.out.print(" "+arr[d]);
        }
        
    }
    
}
