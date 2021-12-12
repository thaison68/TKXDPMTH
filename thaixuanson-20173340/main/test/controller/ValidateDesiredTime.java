package controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * test desired time
 * 
 */
class ValidateDesiredTime{

	private PlaceRushOrderController pController;
	
	@BeforeEach
	void setUp() throws Exception {
		pController = new PlaceRushOrderController();
	}

	@ParameterizedTest
    @CsvSource({
            "01-01-2000 17:00,false",
            "31-12-2021 01:00,true",
            "100-12-2021 01:00,false",
            "18-03-2021 36:00,false",
            "dsjan,false",
            "30-19-2021 12:00,false"
    })
	
	void test(String time, boolean expected) {
		boolean isValid = pController.validateDesiredTime(time);
		assertEquals(isValid, expected);
	}

}
