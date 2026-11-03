class Solution {
    public String defangIPaddr(String address) {
        
        // return address.replace(".","[.]");

        StringBuilder sb =new StringBuilder();

        for(int i=0;i<address.length();i++){
            char ch=address.charAt(i);

            if(ch=='.'){
                sb.append("[.]");

            }else{

                sb.append(ch);
            }
            
        }

        return sb.toString();


    }
}