class Solution {
	void segregate0and1(int[] arr) {
		int n = arr.length;
		int i = 0;
		int j = n - 1;
		
		while (i<j) {
			if (arr[i] == 0) {
				i++;
			}
			if (arr[j] == 1) {
				j--;
			}
			if(i>j)break;
			if (arr[i] == 1 && arr[j] == 0) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
			else if (arr[i] == 1 && arr[j] == 1) {
				j--;
			}
			 else if ((arr[i] == 0 && arr[j] == 0)) {
				i++;
			}
		}
		
	}
}
