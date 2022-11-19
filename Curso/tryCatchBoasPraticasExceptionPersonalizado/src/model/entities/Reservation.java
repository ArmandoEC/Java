package model.entities;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

import model.exceptions.DomainException;

public class Reservation {
	private Integer roomNumber;
	private LocalDate checkIn;
	private LocalDate checkOut;
	
	public static DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	public Reservation(Integer roomNumber, LocalDate checkIn, LocalDate checkOut) {
		if(!checkOut.isAfter(checkIn)) {
			throw new DomainException("A data de checkout deve ser maior que a de checkin");
		}
		
		this.roomNumber = roomNumber;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}

	public Integer getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}

	public LocalDate getCheckIn() {
		return checkIn;
	}

	public LocalDate getCheckOut() {
		return checkOut;
	}

	public int duration() {
		Period diff = Period.between(checkIn, checkOut);
	
		
		return diff.getDays();
	}
	
	public void updateDates(LocalDate checkIn,LocalDate checkOut) {
		LocalDate now = LocalDate.now();
		
		if(checkIn.isBefore(now) || checkOut.isBefore(now)) {
			throw new DomainException("As datas devem ser maiores que a data atual");
		}
		if(!checkOut.isAfter(checkIn)) {
			throw new DomainException("A data de checkout deve ser maior que a data de checkin");
		}
		
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}

	@Override
	public String toString() {
		return "Room "
				+ roomNumber
				+ ", check-in: "
				+ fmt1.format(checkIn).toString()
				+ ", check-out: "
				+ fmt1.format(checkOut).toString()
				+ ", "
				+ duration()
				+ " nights";
	}
	
	
	
}
