class Solution {
	void segregate0and1(int[] arr) {
		int index = 0;
		
		int n = arr.length;
		
		for (int i = 0; i<n; i++) {
			if (arr[i] != 1) {
				arr[index++] = arr[i];
			}
		}
		while (index<n) {
			arr[index++] = 1;
		}
		
	}
}
