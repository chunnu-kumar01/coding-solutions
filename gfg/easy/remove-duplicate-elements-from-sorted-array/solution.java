class Solution {
	ArrayList<Integer> removeDuplicates(int[] arr) {
		// code here
		int n = arr.length;
		ArrayList <Integer> ans = new ArrayList<>();
		int fst = arr[0];
		ans.add(fst);
		
		for (int i = 1; i<n ; i++) {
			if (arr[i] != arr[i - 1]) {
				ans.add(arr[i]);
			}
		}
		return ans;
	}
}
