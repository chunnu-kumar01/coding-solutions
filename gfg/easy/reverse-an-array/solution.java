class Solution {
	public void reverseArray(int arr[]) {
		// code here
		int n = arr.length;
		int i = 0, j = n - 1;
		
		while (i<j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
		
	}
}
