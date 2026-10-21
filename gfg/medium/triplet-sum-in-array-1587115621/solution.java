class Solution {
	public boolean hasTripletSum(int arr[], int target) {
		// code Here
		int n = arr.length;
		
		
		for (int i = 0; i<n-2; i++) {
		    
		HashMap <Integer,Integer>map=new HashMap<>();
		
			int nt = target - arr[i];
			
			for (int j = i + 1; j<n; j++) {
				int t = nt - arr[j];
				
				if (map.containsKey(t)) {
			
				return true;
				}
				
				map.put(arr[j],j);
				
			}
		}
		return false;
	}
}
