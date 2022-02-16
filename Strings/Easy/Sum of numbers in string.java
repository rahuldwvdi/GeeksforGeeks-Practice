//https://practice.geeksforgeeks.org/problems/sum-of-numbers-in-string-1587115621/1/?category[]=Strings&category[]=Strings&difficulty[]=-1&difficulty[]=0&page=1&query=category[]Stringsdifficulty[]-1difficulty[]0page1category[]Strings#

class Solution
{
    //Function to calculate sum of all numbers present in a string.
    public static long findSum(String s)
    {
        int n=s.length();
        int sum=0,num=0;
        for(int i=0;i<n;i++){
            if(Character.isDigit(s.charAt(i))){
                num=(num*10)+s.charAt(i)-'0';
            }else{
                sum+=num;
                num=0;
            }
        }
        sum+=num;
        return sum;
    }
    
}
