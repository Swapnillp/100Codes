//Array
//update Array
class P16{
    public static void update(int arr[]){
        for(int i=0;i<arr.length;i++){
            arr[i]=arr[i]+1;
        }
    }
    public static void main(String args[]){
        int arr[]={11,22,33,44};
        update(arr);
        //printing the array
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+", ");
        }
    }
}