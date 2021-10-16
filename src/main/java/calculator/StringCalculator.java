package calculator;

class StringCalculator {

    public int add(String input) {
        //commit attempt 3
    	if(input.isEmpty()) {
    		return 0;
    	}
    	if(input.length() == 1) {
    		return Integer.parseInt(input);
    	}
    	
    	String[] nums = input.split("[,|\n]+");
    	
    	if(!input.isEmpty() && nums.length == 2) {
    		return Integer.parseInt(nums[0]) + Integer.parseInt(nums[1]);
    	}
    	
    	if(!input.isEmpty() && nums.length == 3) {
    		System.out.println(nums[0]+nums[1]+nums[2]);
    		return Integer.parseInt(nums[0]) + Integer.parseInt(nums[1]) + Integer.parseInt(nums[2]);
    	}
    	return 0;
    }

}