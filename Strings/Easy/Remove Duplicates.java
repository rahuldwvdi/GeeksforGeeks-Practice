//https://practice.geeksforgeeks.org/problems/remove-duplicates3034/1/?category[]=Strings&category[]=Strings&difficulty[]=0&page=1&query=category[]Stringsdifficulty[]0page1category[]Strings#

class Solution {
    String removeDups(String S) {
        String res = "";
        HashSet<Character> set = new HashSet<>();
        for(char ch :S.toCharArray()){
            if(!set.contains(ch)){
                res = res + ch;
            }
            set.add(ch);
        }
        return res;
    }
}
