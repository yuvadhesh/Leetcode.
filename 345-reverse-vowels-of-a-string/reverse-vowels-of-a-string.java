class Solution{
    public String reverseVowels(String s){
        String vowels="aeiouAEIOU";
        StringBuilder onlyVowels=new StringBuilder();
        for(char c:s.toCharArray()){
            if(vowels.indexOf(c)!=-1){
              onlyVowels.append(c);
            }
        }
        onlyVowels.reverse();
        StringBuilder result=new StringBuilder();
        int index=0;
        for(char c:s.toCharArray()){
            if(vowels.indexOf(c)!=-1){
                result.append(onlyVowels.charAt(index++));
            }else 
            {
                result.append(c);
            }
        }
        return result.toString();
    }
}
