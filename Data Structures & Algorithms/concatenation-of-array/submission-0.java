class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[2*nums.length];
        int index = 0;

        for(int i=0; i<2; i++){ //do twice
            for(int num : nums)//put in the array twice bigger
                ans[index++] = num;
        }

        return ans;
    }
}