class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int min_price=INT_MAX;
        int max_price=0;
        for(int prices :prices)
        if(prices<min_price){
            min_price=prices;
        }
        else if(prices-min_price>max_price){
            max_price=prices-min_price;
        }
    return max_price;}
};