package kr.co.OrcaARS.vo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "o_schedule")
public class ScheduleVo {

	@Id
	private String scheduleNumber;
	private String departureTime;
	private String arrivalTime;
	private String departureAirportNum;
	private String arrivalAirportNum;
	private String flightName;
}
