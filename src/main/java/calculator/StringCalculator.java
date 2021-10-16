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
    	
    	String[] nums = input.split(",");
    	
    	if(!input.isEmpty()) {
    		return Integer.parseInt(nums[0]) + Integer.parseInt(nums[1]);
    	}
    	return 0;
    }

}