package controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * test phone number
 * 
 *
 */
class ValidatePhoneNumberTest {
	//ha quang duc 20183888
	private PlaceOrderController placeOrderController;
	//set up
	@BeforeEach
	void setUp() throws Exception {
		placeOrderController = new PlaceOrderController();
	}
	@ParameterizedTest
	@CsvSource({
		"0123445689,true",
		"011223,false",
		",false",
		"abc,false",
		"5151616510,false"
	})

	
	void test(String phone, boolean expected) {
		boolean isValid = placeOrderController.validatePhoneNumber(phone);
		assertEquals(expected, isValid);// using assert
	}

}
