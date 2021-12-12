package controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * test rush order info
 * 
 *
 */
class ValidateRushOrderInfo {
	private PlaceRushOrderController pController;
	//set up
	@BeforeEach
	void setUp() throws Exception {
		pController = new PlaceRushOrderController();
	}

	@ParameterizedTest
    @CsvSource({
            "phuong dao,true",
            "12345,false",
            "12@24,false"
    })
	
	void test(String info, boolean expected) {
        boolean isValid = pController.validateRushOrderInfo(info);
        assertEquals(isValid, expected); // using assert
    }
}
