class Solution {
    public int minSubArrayLen(int target, int[] arr) {
        int i = 0 , sum = 0 , minlen = Integer.MAX_VALUE;
        for(int j=0;j<arr.length;j++){
            sum += arr[j];
            while(sum >= target){
                int len = j-i+1;
                minlen = Math.min(minlen,len);
                sum -= arr[i];
                i++;
            }
        }
        if(minlen == Integer.MAX_VALUE) return 0;
        return minlen;
    }
}