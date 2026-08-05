class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int c=0;
        int s=0;
        for(int i=0;i<k;i++){
            s+=arr[i];
        }
        int av=s/k;
        if(av>=threshold){
                c++;
            }
        for(int i=k;i<arr.length;i++){
            
            s=s+arr[i];
            s=s-arr[i-k];
            av=s/k;
            if(av>=threshold){
                c++;
            }
        }
        return c;
    }

}