class Solution {
	
	int solve(int el, int [] arr) {
		int start = 0;
		int end = arr.length - 1;
		int ans = -10000000;
		
		while (start <= end)
			{
			
			int mid = start + (end - start)/2;
			
			if (arr[mid]>el)
				{
				ans = arr[mid];
				end = mid - 1;
				
			}
			else {
				start = mid + 1;
				
			}
		}
		return ans;
	}
	
	public ArrayList<Integer> greaterElement(int[] arr) {
		
		int [] new_arr = new int [arr.length];
		int n = arr.length;
		for (int i = 0; i<n; i++) {
			new_arr[i] = arr[i];
			
		}
		
		Arrays.sort(new_arr);
		
		ArrayList <Integer> ans = new ArrayList <>();
		
		for (int i = 0; i<n; i++) {
			int el = arr[i];
			int greater = solve(el, new_arr);
			ans.add(greater);
		}
		return ans;
		
	}
}
