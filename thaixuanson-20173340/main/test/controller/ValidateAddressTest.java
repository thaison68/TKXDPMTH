package controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


/**
 * test address 
 * 
 *
 */
class ValidateAddressTest {

	private PlaceOrderController placeOrderController;
	@BeforeEach
	void setUp() throws Exception {
		placeOrderController = new PlaceOrderController();
	}
	@ParameterizedTest
	@CsvSource({
		"abx dcfs,true",
		"ha noi, true",
		"324,false",
		"sdd123,false",
		",false"
	})
	
	void test(String address, boolean expected) {
		boolean isValid = placeOrderController.validateAddress(address);
		System.out.println(address);
		assertEquals(expected, isValid);
	}

}
