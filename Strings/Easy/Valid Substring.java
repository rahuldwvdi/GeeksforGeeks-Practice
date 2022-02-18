//https://practice.geeksforgeeks.org/problems/valid-substring0624/0/?category[]=Strings&category[]=Strings&problemType=functional&difficulty[]=0&company[]=Amazon&company[]=Microsoft&company[]=Google&company[]=Flipkart&company[]=Adobe&company[]=Walmart&page=1&query=category[]StringsproblemTypefunctionaldifficulty[]0company[]Amazoncompany[]Microsoftcompany[]Googlecompany[]Flipkartcompany[]Adobecompany[]Walmartcategory[]Stringspage1#

class Solution {
    static int findMaxLen(String s) {
        int res =0;
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(') stack.push(i);
            else{
                stack.pop();
                if(!stack.isEmpty()){
                    int temp = i-stack.peek();
                    res = Math.max(res, temp);
                }
                else{
                    stack.push(i);
                }
            }
        }
        return res;
    }
};
