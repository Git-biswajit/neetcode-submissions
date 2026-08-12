class Solution {

    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] nums, int target) {

        backtrack(0, nums, target, new ArrayList<>());

        return result;
    }

    public void backtrack(int index,
                          int[] nums,
                          int target,
                          List<Integer> curr) {

        int sum = getSum(curr);

        if (sum == target) {
            result.add(new ArrayList<>(curr));
            return;
        }

        if (sum > target) {
            return;
        }

        for (int i = index; i < nums.length; i++) {

            curr.add(nums[i]);

            // use i, not i+1
            backtrack(i, nums, target, curr);

            curr.remove(curr.size() - 1);
        }
    }

    public int getSum(List<Integer> curr) {

        int sum = 0;

        for (int num : curr) {
            sum += num;
        }

        return sum;
    }
}