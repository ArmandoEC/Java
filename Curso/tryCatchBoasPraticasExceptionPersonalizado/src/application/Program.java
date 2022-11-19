package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import model.entities.Reservation;
import model.exceptions.DomainException;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		try {
			System.out.print("Room number");
			int number = sc.nextInt();
			System.out.print("Data de checkin (dd/MM/yyyy)");
			LocalDate checkIn = LocalDate.parse(sc.next(), fmt1);
			System.out.print("Data de checkin (dd/MM/yyyy)");
			LocalDate checkOut = LocalDate.parse(sc.next(), fmt1);
			
			Reservation reservation = new Reservation(number, checkIn, checkOut);
			System.out.println("Reservation: "+reservation);
			
			System.out.println("\nDigite a data para alterar a reserva:");
			System.out.print("Data de checkin (dd/MM/yyyy)");
			checkIn = LocalDate.parse(sc.next(), fmt1);
			System.out.print("Data de checkin (dd/MM/yyyy)");
			checkOut = LocalDate.parse(sc.next(), fmt1);
			
			reservation.updateDates(checkIn, checkOut);
			System.out.println("Reservation: "+reservation);	
		}
		catch(DomainException e){
			System.out.println("Erro na reserva: "+ e.getMessage());	
		}
		catch(RuntimeException e){
			System.out.println("Erro inesperado");	
		}
		
		sc.close();
	}

}
