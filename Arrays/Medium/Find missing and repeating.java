//using set, O(n) space
class Solve {
    int[] findTwoElement(int arr[], int n) {
        HashSet<Integer> set = new HashSet<>();
        int[] res = new int[2];
        //for duplicate
        for(int i=0;i<n;i++){
            if(set.contains(arr[i])){
                res[0] = arr[i];
            }
            set.add(arr[i]);
        }
        //for missing number
        for(int i=1;i<=n;i++){
            if(!set.contains(i)){
                res[1] = i;
                break;
            }
        }
        return res;
    }
}

//using cycle sort, O(1) space
class Solve {
    int[] findTwoElement(int arr[], int n) {
        int i = 0;
        int[] res = new int[2];
        while(i<n){
            int correctindex = arr[i]-1;
            if(arr[i]!=arr[correctindex]){
                swap(arr,i,correctindex);
            }
            else    i++;
        }
        for(int j=0;j<n;j++){
            if(arr[j]!=j+1){
                res[0] = arr[j];
                res[1] = j+1;
            }
        }
        return res;
    }
    void swap(int arr[], int i, int ci){
        int temp = arr[i];
        arr[i] = arr[ci];
        arr[ci] = temp;
    }
}

