//https://practice.geeksforgeeks.org/problems/largest-number-with-given-sum-1587115620/1/?category[]=Strings&category[]=Strings&problemType=functional&difficulty[]=0&company[]=Amazon&company[]=Microsoft&company[]=Google&company[]=Flipkart&company[]=Adobe&company[]=Walmart&page=1&query=category[]StringsproblemTypefunctionaldifficulty[]0company[]Amazoncompany[]Microsoftcompany[]Googlecompany[]Flipkartcompany[]Adobecompany[]Walmartcategory[]Stringspage1#

class Solution  {
    //Function to return the largest possible number of n digits
    //with sum equal to given sum.
    static String largestNumber(int n, int sum) {
        String res = "";
        if(sum>9*n) return "-1";
        while(n>0){
            if(sum>9){
                res = res + 9;
                sum = sum - 9;
                n--;
            }
            else if(sum<=9 & sum>0){
                res = res + sum;
                sum = 0;
                n--;
            }
            else{
                res = res + 0;
                n--;
            }
        } 
        return res;
    }
}
