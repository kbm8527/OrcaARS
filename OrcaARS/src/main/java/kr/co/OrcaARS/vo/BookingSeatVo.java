package kr.co.OrcaARS.vo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "o_booking_seat")
public class BookingSeatVo {

	@Id
	private String bookingSeatNumber;
	private String seatNumber;
	private String flightName;
}
