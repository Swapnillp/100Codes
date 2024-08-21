//transpose the matrix
class P34{
    public static void transpose(int arr[][]){
        int transpose[][]=new int [3][3];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                transpose[i][j]=arr[j][i];
            }
        }
        //print 
        System.out.println("After transpose:");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }
        
    }
    public static void main(String args[]){
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("Original array:");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        transpose(arr);
        

    }
}