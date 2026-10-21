class Solution {
    public List<Integer> getRow(int rowIndex) {
        rowIndex++;
        List <Integer> ans= new ArrayList<>();
        ans.add(1);
        long prev=1;

        for(int col=1; col<rowIndex;col++){
            long new_el=prev*(rowIndex-col);
            new_el/=col;
            ans.add((int)new_el);
            prev=new_el;

        }
        return ans;


    }
}