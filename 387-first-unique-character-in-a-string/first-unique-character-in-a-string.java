class Solution{
    public int firstUniqChar(String s){
        int arr[]=new int[26];
        for(int i=0;i<s.length();i++){
            int a=s.charAt(i)-'a';
            arr[a]++;
        }
        for(int i=0;i<s.length();i++){
            if(arr[s.charAt(i)-'a']==1){
                return i;
            }
        }
        return-1;
    }
}