package calculator;

class StringCalculator {

	static int addMethodCount = 0;
    public int add(String input) throws Exception {
      
    	getCalledCount();
    	//commit attempt 3
    	if(input.isEmpty()) {
    		return 0;
    	}
    	if(input.length() == 1) {
    		return Integer.parseInt(input);
    	}
    	
    	String[] nums = input.split("[,|\n]+");
    	
    	String delimiter = ",";
    	
    	if(input.matches("//(.*)\n(.*)")){
    		
    		delimiter = Character.toString(input.charAt(2));
			input = input.substring(4);
		}
    	String numList[] = splitNumbers(input, delimiter + "|\n");
    	
    	if(!input.isEmpty()) {
    		return getSum(nums); //Integer.parseInt(nums[0]) + Integer.parseInt(nums[1]);
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

	public Integer getCalledCount() {
		
		return addMethodCount++;
	}
	
	private static String[] splitNumbers(String numbers, String divider){
	    return numbers.split(divider);
	}

}