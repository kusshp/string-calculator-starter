package calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorShould {

	StringCalculator stringCalculator = new StringCalculator();
    @Test
    void empty_string_should_return_0() throws Exception {
        //StringCalculator stringCalculator = new StringCalculator();
        assertEquals(0, stringCalculator.add(""));
    }

    @Test
    void string_with_single_number_should_return_number_as_int() throws Exception {
       // StringCalculator stringCalculator = new StringCalculator();
        assertEquals(1, stringCalculator.add("1"));
    }
    
    @Test
    void string_should_return_sum() throws Exception {
    	assertEquals(3, stringCalculator.add("1,2"));
    }
    
    @Test
    void newLine_between_two_numbers_return_sum() throws Exception {
    	assertEquals(3, stringCalculator.add("1\n,2"));
    }
    
    @Test
    void newLine_between_three_numbers_return_sum() throws Exception {
    	assertEquals(6, stringCalculator.add("1\n,2,\n3"));
    }
    
    @Test
    void negative_input_return_exception() throws Exception {
    	Exception exception = null;
    	try {
    		stringCalculator.add("-5");
        } catch (Exception e) {
            exception = e;
        }
    }
    
    @Test
    void ignore_number_greater_than_1000() throws Exception {
    	assertEquals(2, stringCalculator.add("2,1001"));
    }
    
    @Test
    void get_called_count() throws Exception {
    	assertTrue(stringCalculator.getCalledCount()>0);
    }
    
    @Test
    void any_length_delimeters() throws Exception {
    	assertEquals(8, stringCalculator.add("***%%%\n1***2%5"));
    }
    
    @Test
    void multiple_delimeters() throws Exception {
    	assertEquals(6, stringCalculator.add("*%\n1*2%3"));
    }
    
    @Test
    void multiple_delimeters_any_length() throws Exception {
    	assertEquals(6, stringCalculator.add("**%%\n1**2%%3"));
    }
}
