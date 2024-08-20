//2-D Array
import java.util.*;
import java.util.Scanner;
class P30{
    public static void Search(int arr[][],int key){
        int row=3;
        for(int i=0;i<row;i++){
            int column=3;
            for(int j=0;j<column;j++){
                if(arr[i][j]==key){
                   System.out.println("element at index :"+i+" "+j);
                }
            }
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println(("Enter matrix:"));
        int arr[][]=new int[3][3];
        int row=arr.length,column=arr[0].length;
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        //finding key element.
        int key=5;
        Search(arr,key);
        //printing array
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        

    }
}