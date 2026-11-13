class Solution {
	public void sortInWave(int arr[]) {
	    
	    int n = arr.length;
		for (int i = 0; i<n ; i += 2) {
			if (i == n - 1)break;
			int temp = arr[i];
			arr[i] = arr[i + 1];
			arr[i + 1] = temp;
		}
	}
}
