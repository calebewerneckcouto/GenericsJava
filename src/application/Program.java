package application;

import java.util.Scanner;

import entities.PrintService;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		PrintService<Integer> ps = new PrintService<>();//aceitando qualquer tipo
		
		PrintService<String> pst = new PrintService<>();//aceitando qualquer tipo
		
		System.out.print("How many values? ");
		int n =sc.nextInt();
		
		
		
		for(int i=0 ; i<n; i++) {
			int value = sc.nextInt();
			String nome = sc.next();
			ps.addValue(value);
			pst.addValue(nome);
		}
		
		ps.print();
		pst.print();
		System.out.println("First: " + ps.first());
		System.out.println("First: " + pst.first());
		
		
		sc.close();

	}

}
