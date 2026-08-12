class Solution {
    public int maxTurbulenceSize(int[] arr) {
        int n = arr.length;
        int current =1;
        int max =1;
        for(int i=1;i<n;i++){
            if(arr[i]==arr[i-1]){
                current = 1;
            }
            else if(i==1 || arr[i]>arr[i-1] && arr[i-1]<arr[i-2] ||
            arr[i]<arr[i-1] && arr[i-1]>arr[i-2] ){
                current++;
            }
            else{
                current =2;
            }
            max = Math.max(max, current);
        }
        return max;
        
    }
}