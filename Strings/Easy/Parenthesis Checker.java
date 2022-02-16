//https://practice.geeksforgeeks.org/problems/parenthesis-checker2744/1/?category[]=Strings&category[]=Strings&problemType=functional&difficulty[]=0&company[]=Amazon&company[]=Microsoft&company[]=Google&company[]=Flipkart&company[]=Adobe&company[]=Walmart&page=1&query=category[]StringsproblemTypefunctionaldifficulty[]0company[]Amazoncompany[]Microsoftcompany[]Googlecompany[]Flipkartcompany[]Adobecompany[]Walmartcategory[]Stringspage1#

class Solution
{
    static boolean ispar(String x){
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<x.length();i++){
            char c = x.charAt(i);
            if(c=='{' || c=='[' ||c=='(') stack.push(c);
            else{
                if(!stack.isEmpty()){
                    char top = stack.peek();
                    if((top== '[' && c ==']') || (top =='{' && c=='}') || (top=='(' && c==')'))
                        stack.pop();
                    else 
                        return false; 
                }
                else {
                        return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
