//https://practice.geeksforgeeks.org/problems/red-or-green5711/1/?category[]=Strings&category[]=Strings&page=1&query=category[]Stringspage1category[]Strings#

class Solution {
    static int RedOrGreen(int N, String S) {
        int gcount =0;
        int rcount =0;
        for(char ch : S.toCharArray()){
            if(ch=='G'){
                gcount += 1;
            }
            else{
                rcount +=1;
            }
        }
        return gcount<rcount? gcount:rcount;
    }
}
