class Solution {
    public int[] twoSum(int[] nums, int target) {
        int len = nums.length;
        int[] result = new int[2];
        List<Integer> arrList = new ArrayList<Integer>();
        for(int i = 0; i < len; i++) {
            for(int j = i + 1; j < len; j++) {
                if(nums[i] + nums[j] == target) {
                    arrList.add(i);
                    arrList.add(j);
                }
            }
        }
        result = arrList.stream().mapToInt(i->i).toArray();
        return result;
    }
}
