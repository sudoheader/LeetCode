class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new LinkedList<>();
        Arrays.sort(nums);

        int length = nums.length;

        for(int i = 0; i < length - 2; i++) {
            if(i > 0 && nums[i] == nums[i - 1])
                continue;
            int l = i + 1;
            int r = length - 1;

            while(l < r) {
                int total = nums[i] + nums[l] + nums[r];
                if(total < 0) {
                    l += 1;
                } else if(total > 0) {
                    r -= 1;
                } else {
                    res.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    while(l < r && nums[l] == nums[l + 1]) {
                        l += 1;
                    }
                    while(l < r && nums[r] == nums[r - 1]) {
                        r -= 1;
                    }

                    l += 1;
                    r -= 1;
                }
            }
        }
        return res;
    }
}
