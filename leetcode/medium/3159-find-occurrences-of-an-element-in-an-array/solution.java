class Solution {
    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {

        int n = nums.length;
        ArrayList<Integer> indexes = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (nums[i] == x) {
                indexes.add(i);
            }
        }

      int[] ans = new int[queries.length];

        for(int i=0;i<queries.length;i++){
            int k= queries[i];

            if( k<=indexes.size()){
                ans[i]=indexes.get(k-1);
            }
            else{
                ans[i]=-1;
            }


        }
        return ans;

    }
}