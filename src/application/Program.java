package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual o pre�o do d�lar? ");
		double dollarPrice = sc.nextDouble();
		System.out.print("Quantos d�lares ser�o comprados? ");
		double amout = sc.nextDouble();
		double result = CurrencyConverter.dollarToReal(amout, dollarPrice);
		System.out.printf("Valor a ser pago em reais = %.2f%n", result);
		sc.close();
	}

}
