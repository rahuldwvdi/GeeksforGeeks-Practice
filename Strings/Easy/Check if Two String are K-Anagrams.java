//https://practice.geeksforgeeks.org/problems/check-if-two-strings-are-k-anagrams-or-not/0/?category[]=Strings&category[]=Strings&problemType=functional&difficulty[]=0&company[]=Amazon&company[]=Microsoft&company[]=Google&company[]=Flipkart&company[]=Adobe&company[]=Walmart&page=1&query=category[]StringsproblemTypefunctionaldifficulty[]0company[]Amazoncompany[]Microsoftcompany[]Googlecompany[]Flipkartcompany[]Adobecompany[]Walmartcategory[]Stringspage1#

class Solution {
    boolean areKAnagrams(String s1, String s2, int k) {
        if(s1.length() != s2.length()) return false;
        int[] a = new int[26];
        int[] b = new int[26];
        for(int i=0;i<s1.length();i++){
            a[s1.charAt(i) - 'a']++;
        }
        for(int i=0;i<s1.length();i++){
            b[s2.charAt(i) - 'a']++;
        }
        int count =0;
        for(int i=0;i<26;i++)
        {
            if(a[i]>b[i]) count +=a[i]-b[i];
        }
        if(count<=k)
            return true;
        else
            return false;
    }
}
