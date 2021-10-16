package calculator;

class StringCalculator {

    public int add(String input) throws Exception {
        //commit attempt 3
    	if(input.isEmpty()) {
    		return 0;
    	}
    	if(input.length() == 1) {
    		return Integer.parseInt(input);
    	}
    	
    	String[] nums = input.split("[,|\n]+");
    	
    	if(!input.isEmpty() && nums.length == 2) {
    		return getSum(nums); //Integer.parseInt(nums[0]) + Integer.parseInt(nums[1]);
    	}
    	
    	if(!input.isEmpty() && nums.length == 3) {
    		//System.out.println(nums[0]+nums[1]+nums[2]);
    		return getSum(nums); //Integer.parseInt(nums[0]) + Integer.parseInt(nums[1]) + Integer.parseInt(nums[2]);
    	}
    	return 0;
    }

	private int getSum(String[] nums) throws Exception {
		for(String s : nums) {
			if(Integer.parseInt(s) < 0) {
				throw new Exception("negatives not allowed");
			}
		}
		int sum = 0;
		for(String s : nums) {
			if(Integer.parseInt(s) > 1000) {
				continue;
			}
			
			sum += Integer.parseInt(s);
		}
		return sum;
	}

}