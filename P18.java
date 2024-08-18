//Largest Element in array
import java.util.*;
class P18{

    public static int LargestElement(int arr[]){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,44,5,6,7};
        System.out.println("Largest element is :"+LargestElement(arr));
    }
}