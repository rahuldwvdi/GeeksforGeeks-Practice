//https://practice.geeksforgeeks.org/problems/anagram-1587115620/1/?category[]=Strings&category[]=Strings&problemType=functional&difficulty[]=0&company[]=Amazon&company[]=Microsoft&company[]=Google&company[]=Flipkart&company[]=Adobe&company[]=Samsung&company[]=Goldman%20Sachs&company[]=Paytm&company[]=Walmart&company[]=Morgan%20Stanley&company[]=OYO%20Rooms&page=1&query=category[]StringsproblemTypefunctionaldifficulty[]0company[]Amazoncompany[]Microsoftcompany[]Googlecompany[]Flipkartcompany[]Adobecompany[]Samsungcompany[]Goldman%20Sachscompany[]Paytmcompany[]Walmartcompany[]Morgan%20Stanleycompany[]OYO%20Roomscategory[]Stringspage1#

class Solution
{    
    //Function is to check whether two strings are anagram of each other or not.
    public static boolean isAnagram(String a,String b)
    {
        if(a.length()!=b.length()) return false;
        int[] m = new int[26];
        int[] n = new int[26];
        for(int i=0;i<a.length();i++){
            m[a.charAt(i)-'a']++;
            n[b.charAt(i)-'a']++;
        }
        for(int i =0;i<26;i++){
            if(m[i]!=n[i]) return false;
        }
        return true;
    }
}
