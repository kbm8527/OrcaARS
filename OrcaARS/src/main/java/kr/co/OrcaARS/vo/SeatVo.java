package kr.co.OrcaARS.vo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "o_seat")
public class SeatVo {

	@Id
	private String seatNumber;
	private String flightName;
	private String seatClass;
	
	
	
}
