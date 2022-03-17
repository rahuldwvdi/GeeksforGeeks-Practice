//https://practice.geeksforgeeks.org/problems/flip-bits0240/1

class Solution {
    //kadane's algorithm
    public static int maxOnes(int a[], int n) {
        int[] temp = new int[n];
        int count = 0;
        int countones = 0;
        for(int i=0;i<n;i++){
            if(a[i]==0){
                temp[i] = 1;
            }
            else{
                countones++;
                temp[i] = -1;
            }
        }
        int csum = 0;
        int maxsum = 0;
        for(int i=0;i<n;i++){
            csum += temp[i];
            if(csum> maxsum){
                maxsum = csum;   
            }
            if(csum<0){
                csum =0;   
            }
        }
        return maxsum + countones;
    }
}
