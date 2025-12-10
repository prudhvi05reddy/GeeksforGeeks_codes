// import java.util.Scanner;
class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        // Scanner sc = new Scanner (System.in);
        // int n = sc.nextInt();
        // arr=new int[n];
        // for(int i=0;i<n;i++){
        //     arr[i]=sc.nextInt();
        // }
        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                smallest=largest;
                largest=arr[i];
            }
            else if (arr[i] > smallest && arr[i] != largest) {
                smallest = arr[i];
        }
    }
            return smallest;
    }
}