class Solution {
    public boolean checkIfPangram(String sentence) {

        boolean arr[] = new boolean[26];
        int n=sentence.length();
        int count =0;

        for(int i=0;i<n;i++){
            char ch= sentence.charAt(i);

            if(arr[ch-'a']==false)
            count++;
            arr[ch-'a']=true;
        }

           return count==26; 
        
    }
}