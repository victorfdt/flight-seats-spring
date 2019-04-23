package com.victorfdt.flightseats;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class FlightSeatsForm {

	@NotNull(message = "is required")
	@Min(value = 0, message = "The value must be greater than or equal to 0.")
	private Integer qtdRows;

	@NotNull(message = "is required")
	@Size(min = 1, message = "is required")
	private String occupiedSeats;

	public Integer getQtdRows() {
		return qtdRows;
	}

	public void setQtdRows(Integer qtdRows) {
		this.qtdRows = qtdRows;
	}

	public String getOccupiedSeats() {
		return occupiedSeats;
	}

	public void setOccupiedSeats(String occupiedSeats) {
		this.occupiedSeats = occupiedSeats;
	}

}
