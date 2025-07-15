class Solution {
public:
    bool isPalindrome(int x) {
          long temp=x,sum=0;
        while(x>0){
            int dig=x%10;
            sum=sum*10+dig;
            x=x/10;
        }
        if(sum==temp)
            return true;
        else
        return false; 
    }
};

   
