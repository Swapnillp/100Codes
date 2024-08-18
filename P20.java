//Binary Search
import java.util.*;
class P20{
    public static int BinarySearch(int arr[],int key){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+end;
            //comparision
            //mid part
            if(arr[mid]==key){
                return mid;
            }
            if(arr[mid]<key){ //right part
                start=mid+1;
            }else{            //left part
                end=mid-1;
            }
        }return -1;

    }
    public static void main(String args[]){
        int arr[]={11,12,13,14,15,16,17,18,19,20};
        int key=17;
        int index=BinarySearch(arr,key);
        if(index==-1){
            System.out.print("index not found :");
        }else{
            System.out.print("index is :"+index);
        }
    }
}
