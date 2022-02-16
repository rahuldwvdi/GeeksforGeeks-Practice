//https://practice.geeksforgeeks.org/problems/reverse-words-in-a-given-string5459/1/?category[]=Strings&category[]=Strings&problemType=functional&difficulty[]=0&company[]=Amazon&company[]=Microsoft&company[]=Google&company[]=Flipkart&company[]=Adobe&company[]=Walmart&page=1&query=category[]StringsproblemTypefunctionaldifficulty[]0company[]Amazoncompany[]Microsoftcompany[]Googlecompany[]Flipkartcompany[]Adobecompany[]Walmartcategory[]Stringspage1#

class Solution 
{
    //Function to reverse words in a given string.
    String reverseWords(String S)
    {   
        String res = "";
        if (S.length()==0) return "";
        String[] a = S.split("\\.");
        for(int i=a.length-1;i>0;i--){
            res+= a[i] + ".";
        }
        res += a[0];
        return res;
    }
}
