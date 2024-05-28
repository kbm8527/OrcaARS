package kr.co.OrcaARS.vo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "o_flight_booking")
public class FlightBookingVo {

	@Id
	private String bookingNumber;
	private String ticketNumber;
	private String bookingDate;
	private String bookingAmount;
	private String memberNumber;
	private String bookingSeatNumber;
	private String scheduleNumber;
	
	
}
