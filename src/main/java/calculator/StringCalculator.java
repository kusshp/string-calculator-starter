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
    	return 0;
    }

}