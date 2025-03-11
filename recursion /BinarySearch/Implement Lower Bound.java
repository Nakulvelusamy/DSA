public class Solution {
    public static int lowerBound(int []arr, int n, int x) {
        int start=0,end=arr.length-1;
        int ans=arr.length;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]>=x){
                ans=mid;
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return ans;
    }
}
