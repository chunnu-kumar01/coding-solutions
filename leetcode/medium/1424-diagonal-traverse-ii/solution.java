class Solution {
    public int[] findDiagonalOrder(List<List<Integer>> nums) {

        HashMap<Integer, List<Integer>> hp = new HashMap<>();
        int total = 0;

        //Always the sum of diagonals is equals.

        for(int i=nums.size()-1; i>=0;i--){
            for(int j=0;j<nums.get(i).size();j++){
                int ele =nums.get(i).get(j);
                int dia=i+j;

                if(!hp.containsKey(dia)){
                    hp.put(dia,new ArrayList<Integer>());
                }
                hp.get(dia).add(ele);
                total++;
            }
        }
        int []ans=new int [total];
        int index=0;
        int key=0;

        while(hp.containsKey(key)){
            for(int el:hp.get(key)){
                ans[index]=el;
                index++;
            }
            key++;
        }
        return ans;

    }
}