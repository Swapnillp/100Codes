//counting the particular element.
class P33{
    public static int count(int arr[][],int key){
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==key){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String args[]){
        int arr[][]={{1,2,3},{4,3,6},{7,8,3}};
        int key=3;
        int ct=count(arr,key);
        System.out.println(ct);

    }
}