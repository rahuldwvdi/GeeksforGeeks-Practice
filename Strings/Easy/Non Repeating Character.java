//https://practice.geeksforgeeks.org/problems/non-repeating-character-1587115620/0/?category[]=Strings&category[]=Strings&problemType=functional&difficulty[]=0&company[]=Amazon&company[]=Microsoft&company[]=Google&company[]=Flipkart&company[]=Adobe&company[]=Walmart&page=1&query=category[]StringsproblemTypefunctionaldifficulty[]0company[]Amazoncompany[]Microsoftcompany[]Googlecompany[]Flipkartcompany[]Adobecompany[]Walmartcategory[]Stringspage1#

class Solution
{
    //Function to find the first non-repeating character in a string.
    static char nonrepeatingCharacter(String s)
    {
        int[] freq = new int[26];
        for(int i=0;i<s.length();i++)   freq[s.charAt(i) - 'a']++;
        for(int i=0;i<s.length();i++){
           if(freq[s.charAt(i) - 'a']==1) 
                return s.charAt(i); 
        }
        return '$';
    }
}
