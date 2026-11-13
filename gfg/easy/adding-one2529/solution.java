class Solution {
	ArrayList<Integer> addOne(int[] arr) {
		// code here
		int n = arr.length;
		ArrayList<Integer> ans = new ArrayList<>();
		int carry = 1;
		
		for (int i = n - 1; i >= 0; i--) {
			if (arr[i]+carry <= 9) {
				ans.add(arr[i]+carry);
				carry = 0;
			}
			else {
				ans.add(0);
				carry = 1;
			}
			
		}if(carry==1)ans.add(carry);
			Collections.reverse(ans);
		return ans;
	}
}
