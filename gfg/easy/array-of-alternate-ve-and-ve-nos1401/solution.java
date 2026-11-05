class Solution {
	void rearrange(ArrayList<Integer> arr) {
		// code here
		
		ArrayList<Integer> pos = new ArrayList<>();
		ArrayList<Integer> neg = new ArrayList<>();
		
		for (int nums :arr) {
			
			if (nums >= 0) {
				pos.add(nums);
			}
			else {
				neg.add(nums);
			}
		}
		
		int index = 0;
		int i = 0;
		
		while (i<pos.size() && i<neg.size()) {
			
			arr.set(index++, pos.get(i));
			arr.set(index++, neg.get(i));
			
			i++;
			
		}
		
		while (i<pos.size()) {
			arr.set(index++, pos.get(i++));
			
		}
		
		while (i<neg.size()) {
			arr.set(index++, neg.get(i++));
		}
		
	}
}
