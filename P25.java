//maxsubarray
class P25{
    public static void maxsubarray(int arr[]){
        int currentSum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            
            for(int j=i;j<arr.length;j++){
                currentSum=0;
                   for(int k=i;k<=j;k++){
                    currentSum+=arr[k];
                   }
                   System.out.println(currentSum);
                   if(maxSum<currentSum){
                    maxSum=currentSum;
                   }
                }
                System.out.println();
        }
        System.out.println("max sum of subarray is :"+maxSum);
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,5};
        maxsubarray(arr);
    }
}