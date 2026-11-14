class Solution {
	public void sort012(int[] arr) {
		int n = arr.length;
		int c0 = 0;
		int c1 = 0;
		int c2 = 0;
		int i = 0;
		
		while (i<n) {
			if (arr[i] == 0) {
				c0++;
				
			}
			else if (arr[i] == 1) {
				c1++;
			}
			else {
				c2++;
			}
			
			i++;
		}
		
		i = 0;
		while (i<c0) {
			arr[i++] = 0;
			
		}
		
		while (i<c0 + c1) {
		    
			arr[i++] = 1;
			
		}
		while (i<n) {
			arr[i++] = 2;
			
		}
		
	}
}
