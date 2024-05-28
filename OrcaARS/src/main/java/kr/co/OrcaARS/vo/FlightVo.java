package kr.co.OrcaARS.vo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "o_flight")
public class FlightVo {

	
	@Id
	private String flightName;
	private String departures;
	private String arrivals;
	private String departureDate;
	private String returnDate;
	private int passenger;
	
	
}
