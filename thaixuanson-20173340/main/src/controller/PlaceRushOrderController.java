package controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import utils.Configs;

/**
 * controller place rush order
 * 
 *
 */
public class PlaceRushOrderController {

	// format desired time input
	public static final String RECEIVE_TIME_FORMATTER = "dd-MM-yyyy HH:mm";
	
	 public PlaceRushOrderController() {
		 
	 }
	
	/**
	 * method validate place rush order info 
	 * @param info
	 * @return value validate info
	 */
	 
	public boolean validateRushOrderInfo(String info) {
		if (info == null || info.length() == 0) return false;
		for (char c: info.toCharArray()) {
			if (c ==' ' || c==',' || c == '.' || Character.isLetter(c)) {
				continue;
			}
			else return false;
		}
		return true;
	}
	
	
	
	/**
	 * method validate desired time
	 * @param desiredTime
	 * @return validate time
	 */
	public boolean validateDesiredTime(String desiredTime) {
		try {
			// using DateTimeFormat
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern(RECEIVE_TIME_FORMATTER);
            LocalDateTime time = LocalDateTime.parse(desiredTime, formatter);
            
            //check the desired time after the current time
            LocalDateTime currentDateTime = LocalDateTime.now();
            if(time.isAfter(currentDateTime)) return true;
            	return false;
        } catch (Exception e) {
            return false;
        }
	}
}
