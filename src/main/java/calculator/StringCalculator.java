package calculator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
    	
    	String[] nums = input.split("[,|\\r|\\n|\\\\*|%]+");
    	
    	if(!input.isEmpty()) {
    		return getSum(nums); //Integer.parseInt(nums[0]) + Integer.parseInt(nums[1]);
    	}
    	
    	return 0;
    }

	private int getSum(String[] nums) throws Exception {
		
		
		List<String> list = new ArrayList<>(Arrays.asList(nums));
		list.removeAll(Arrays.asList("", null));
		String [] array = list.toArray(new String[list.size()]);
		System.out.println("converted "+Arrays.toString(array));
		
		for(String s : array) {
			if(Integer.parseInt(s) < 0) {
				throw new Exception("negatives not allowed");
			}
		}
		int sum = 0;
		for(String s : array) {
			if(Integer.parseInt(s) > 1000) {
				continue;
			}
			System.out.println(s);
			sum += Integer.parseInt(s);
		}
		return sum;
	}

	public Integer getCalledCount() {
		
		return addMethodCount++;
	}

}