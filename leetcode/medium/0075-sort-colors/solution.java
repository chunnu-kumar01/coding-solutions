class Solution {
    public void sortColors(int[] nums) {

       	int n = nums.length;
		int c0 = 0;
		int c1 = 0;
		int c2 = 0;
		int i = 0;
		
		while (i<n) {
			if (nums[i] == 0) {
				c0++;
				
			}
			else if (nums[i] == 1) {
				c1++;
			}
			else {
				c2++;
			}
            i++;
		}
		i=0;
		while (i<c0) {
			nums[i++] = 0;
		}
        while (i<c0+c1) {
			nums[i++] = 1;
		}
        while (i<n) {
			nums[i++] = 2;
		}
		 
    }
}