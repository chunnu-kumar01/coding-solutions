class Solution {
    public int search(int[] nums, int target) {
        // int ans=-1;
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]==target){
        //         ans =i;
        //     }

        // }
        // return ans;
        int n = nums.length;
        int low = 0;
        int high = n - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {

                return mid;

            }
            // for left half sorted

            if (nums[low] <= nums[mid] ) {

                if (target >=nums[low]&&target<nums[mid] ) 
                {
                     high = mid - 1;
                } 
                else 
                {
                    low = mid + 1;
                   
                }

            }

            //for right half sorted
            else {

                if (target > nums[mid] && target <= nums[high]) 
                {
                    low = mid + 1;
                } else
                {
                    high = mid - 1;
                }

            }

        }

        return -1;

    }
}