package learn;

public class HouseRobberQ198 {

	public static void main(String[] args) {
		
		int[] nums = {5,100,1,1,0,0,0,0,1,3,100,2,10};
		
		if (nums == null || nums.length == 0) System.out.println(0);
        if (nums.length == 1) System.out.println(nums[0]);

        int prev2 = 0; // Represents dp[i-2]
        int prev1 = 0; // Represents dp[i-1]

        for (int num : nums) {
            int temp = prev1;
            prev1 = Math.max(prev1, prev2 + num);
            prev2 = temp;
        }


        System.out.println(prev1);
		
	}

}
