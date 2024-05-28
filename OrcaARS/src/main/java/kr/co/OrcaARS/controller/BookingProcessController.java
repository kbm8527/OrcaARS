package kr.co.OrcaARS.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BookingProcessController {

	@GetMapping("/booking/bookingtrip")
	public String bookingtrip () {
		
		return "booking/bookingtrip";
	}
	
	@GetMapping("/booking/flight-to")
	public String flightto () {
		
		return "booking/flight-to";
	}
	
	@GetMapping("/booking/flight-from")
	public String flightfrom () {
		
		return "booking/flight-from";
	}
	
	@GetMapping("/booking/passenger")
	public String passenger () {
		
		return "booking/passenger";
	}
	
	@GetMapping("/booking/seat")
	public String seat () {
		
		return "booking/seat";
	}
	
	
	
}
