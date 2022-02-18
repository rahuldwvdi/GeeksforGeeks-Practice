//https://practice.geeksforgeeks.org/problems/check-if-string-is-rotated-by-two-places-1587115620/0/?category[]=Strings&category[]=Strings&problemType=functional&difficulty[]=0&company[]=Amazon&company[]=Microsoft&company[]=Google&company[]=Flipkart&company[]=Adobe&company[]=Walmart&page=1&query=category[]StringsproblemTypefunctionaldifficulty[]0company[]Amazoncompany[]Microsoftcompany[]Googlecompany[]Flipkartcompany[]Adobecompany[]Walmartcategory[]Stringspage1#

class Solution
{
    //Function to check if a string can be obtained by rotating
    //another string by exactly 2 places.
    public static boolean isRotated(String s1, String s2)
    {   
        if(s1.length()!=s2.length()) return false;
        if((s1.substring(2) + s1.substring(0,2)).equals(s2)) return true;
        if((s1.substring(s1.length()-2) + s1.substring(0,s1.length()-2)).equals(s2)) return true;
        return false;
    }
    
}
