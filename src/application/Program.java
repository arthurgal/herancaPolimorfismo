package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import inteties.Company;
import inteties.Individual;
import inteties.TaxPayer;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.print("Enter the number of tax payers:");
		int number = sc.nextInt();
		
		List<TaxPayer> list = new ArrayList<>();
		
		for(int i = 0; i < number; i++) {
			
			System.out.println("##############################");
			
			System.out.print("Individual or company (i/c)? ");
			char letra = sc.next().charAt(0);
			
			System.out.print("Name: ");
			String name = sc.next();
			
			System.out.print("Anual income: ");
			double renda = sc.nextDouble();
			
			if(letra == 'i') {
				System.out.print("Health expenditures: ");
				double gastoSaude = sc.nextDouble();
				list.add(new Individual (name, renda, gastoSaude));
			}
			if(letra == 'c') {
				System.out.print("Number of employees: ");
				int employees = sc.nextInt();
				list.add(new Company (name, renda, employees));
			}
		}
		
		System.out.println("TAXES PAID: ");
		for (TaxPayer pagador : list) {
			System.out.println(pagador);
		}
		
		sc.close();
	}

}
