class Solution {
    int missingNum(int arr[]) {
        // code here
        int n=arr.length+1;
        long expectedsum = (long)n*(n+1)/2;
        long originalsum=0;
        
        for(int num:arr){
            originalsum+=num;
        }   
        return (int)(expectedsum-originalsum);
    }
}