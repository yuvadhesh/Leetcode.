class Solution {
    public String convertToTitle(int a) {
        StringBuilder sb = new StringBuilder();
        while(a>0){
            a--;          
            int rem=a%26;
            char ch=(char)('A'+rem);
            sb.append(ch);
            a/=26;
        }
        return sb.reverse().toString();
    }
}
