//2-D Array
import java.util.*;
import java.util.Scanner;
class P30{
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
        //printing array
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}