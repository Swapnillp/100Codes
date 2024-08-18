//Smallest Element in array
import java.util.*;
class P19{

    public static int SmallestElement(int arr[]){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,-45,5,6,7};
        System.out.println("Smallest element is :"+SmallestElement(arr));
    }
}