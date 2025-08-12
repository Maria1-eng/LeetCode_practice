/*
https://leetcode.com/problems/two-sum/
*/
public class Solution
{
    public int[] TwoSum(int[] nums, int target)
    {
        int c = nums.Length;

        for (int i = 0; i < c - 1; i++)
        {
            for (int j = i + 1; j < c; j++)
            {
                if (nums[i] + nums[j] == target)
                {
                    return new[] { i, j };
                }
            }
        }

        throw new InvalidOperationException("No two sum solution found.");
    }
}
