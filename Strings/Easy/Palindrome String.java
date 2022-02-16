//https://practice.geeksforgeeks.org/problems/palindrome-string0817/1/?category[]=Strings&category[]=Strings&problemType=functional&difficulty[]=0&company[]=Amazon&company[]=Microsoft&company[]=Google&company[]=Flipkart&company[]=Adobe&company[]=Walmart&page=1&query=category[]StringsproblemTypefunctionaldifficulty[]0company[]Amazoncompany[]Microsoftcompany[]Googlecompany[]Flipkartcompany[]Adobecompany[]Walmartcategory[]Stringspage1

class Solution {
    int isPalindrome(String S) {
        int l =0;
        int r = S.length() -1;
        while(l<r){
           if(S.charAt(l) == S.charAt(r)){
               l++;
               r--;
           }
           else    return 0;
        }
        return 1;
    }
}
