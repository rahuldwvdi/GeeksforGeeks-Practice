class Solution {
    static int setBits(int N) {
        //naive approach
        int res = 0; 
        while(N>0){
            if( (N&1) == 1) res++;
            N = N>>1;
        }
        return res;
    }
}
