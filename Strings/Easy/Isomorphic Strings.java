//https://practice.geeksforgeeks.org/problems/isomorphic-strings-1587115620/0/?category[]=Strings&category[]=Strings&problemType=functional&difficulty[]=0&company[]=Amazon&company[]=Microsoft&company[]=Google&company[]=Flipkart&company[]=Adobe&company[]=Walmart&page=1&query=category[]StringsproblemTypefunctionaldifficulty[]0company[]Amazoncompany[]Microsoftcompany[]Googlecompany[]Flipkartcompany[]Adobecompany[]Walmartcategory[]Stringspage1#

class Solution
{
    //Function to check if two strings are isomorphic.
    public static boolean areIsomorphic(String s1,String s2)
    {
        if(s1.length()!=s2.length()) return false;
        int[] a = new int[26];
        int[] b = new int[26];
        for(int i=0;i<s1.length();i++){
            a[s1.charAt(i) - 'a']++;
            b[s2.charAt(i) - 'a']++;
        }
        for(int i=0;i<s1.length();i++){
            if(a[s1.charAt(i) - 'a']!=b[s2.charAt(i) - 'a']) return false;
        }
        return true;
    }
}
