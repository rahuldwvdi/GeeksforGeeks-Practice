//https://practice.geeksforgeeks.org/problems/longest-k-unique-characters-substring0853/0/?category[]=Strings&category[]=Strings&problemType=functional&difficulty[]=0&company[]=Amazon&company[]=Microsoft&company[]=Google&company[]=Flipkart&company[]=Adobe&company[]=Walmart&page=1&query=category[]StringsproblemTypefunctionaldifficulty[]0company[]Amazoncompany[]Microsoftcompany[]Googlecompany[]Flipkartcompany[]Adobecompany[]Walmartcategory[]Stringspage1#

class Solution {
    public int longestkSubstr(String s, int k) {
        //sliding window
        HashMap<Character, Integer> map = new HashMap<>();
        int i=0,j=0;
        int max = -1;
        while(j<s.length()){
            map.put(s.charAt(j), map.getOrDefault(s.charAt(j),0)+1);
            if(map.size()<k) j++;
            else if(map.size()==k){
                max = Math.max(max, j-i+1);
                j++;
            }
           else if(map.size()>k){
               while(map.size()>k){
                   char ch = s.charAt(i);
                   map.put(ch, map.get(ch) -1);
                   if(map.get(ch)==0) map.remove(ch);
                   i++;
                }
               j++;
            }
        }
        return max;
    }
}
