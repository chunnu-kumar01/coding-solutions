class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int n = arr.length;
        int low = 0;
        int high = n - 1;
        int ans=-1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (mid - 1 >= 0 && arr[mid] > arr[mid - 1] && mid + 1 < n && arr[mid] > arr[mid + 1]) {

                return mid;
            }
            else if(mid-1>=0 && arr[mid-1] > arr[mid]){
                high=mid-1;
            }
            else{
                low=mid+1;
            }

            
        }
        return ans;

    }
}