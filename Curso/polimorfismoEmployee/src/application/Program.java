package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import polimorfismoEmployee.Employee;
import polimorfismoEmployee.OutSourceEmployee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		List<Employee> employees = new ArrayList<>();
		
		System.out.println("Enter the number of employees: ");
		int n =sc.nextInt();
		
		for(int i = 0; i<n; i++) {
			System.out.printf("Employee #%d data:\n",i+1);
			System.out.print("Outsourced? (y/n)");
			char response = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			
			if(response == 'y') {
				System.out.print("Additional Charge: ");
				double additionalCharge = sc.nextDouble();
				
				Employee addOutSource = new OutSourceEmployee(name, hours, valuePerHour, additionalCharge);
				employees.add(addOutSource);
				
			}
			else {
				Employee addEmployee = new Employee(name, hours, valuePerHour);
				employees.add(addEmployee);
			}
			
		}
		
		System.out.println("PAYMENTS: ");
		for(Employee c: employees) {
			System.out.println(c);
		}
		
		
		sc.close();

	}

}
