//EX 2b somma, sottrazione, prodotto e rapporto di numeri complessi
package Exercises;
import java.util.InputMismatchException;
import java.util.Scanner;
public class ComplexNumbers {
	private int real;
	private int imaginary;
	
	
	public ComplexNumbers(int r, int i) {
		this.real = r;
		this.imaginary = i;
		
	}
	
	public void add(ComplexNumbers c) {
		int a = this.real + c.real;
		int b = this.imaginary + c.imaginary;
		
		System.out.println("Somma:" + a + "+" + b + "i");
	}
	
	public void prod(ComplexNumbers c) {
		int a = this.real * c.real - this.imaginary * c.imaginary;
		int b = this.real * c.imaginary + this.imaginary * c.real;
		
		System.out.println("Prodotto: " + a + "+" + b + "i");
	}
	
	public void sub(ComplexNumbers c) {
		int a = this.real - c.real;
		int b = this.imaginary - c.imaginary;
		
		System.out.println("Sottrazione: " + a + "+" + b + "i");
	}
	
	public void quot(ComplexNumbers c) {
		int num1 = (this.real * c.real + this.imaginary * c.imaginary);
		int num2 = (this.imaginary * c.real - this.real * c.imaginary);
		int den = (c.real*c.real+c.imaginary*c.imaginary);
		System.out.println("Rapporto: " + num1 + "/" + den+ "+" + num2 + "/"+ den + "i");
	}

	
	public static void main(String[] args) {

		int i1 = 0, i2 = 0, r1 = 0, r2 = 0;
		Scanner scanner = new Scanner(System.in);	
		try {
			System.out.println("Primo numero");
			System.out.print("Inserisci parte reale: ");
			r1 = scanner.nextInt();
			System.out.print("Inserisci parte immaginaria: ");
			i1 = scanner.nextInt();
			System.out.println("Secondo numero");
			System.out.print("Inserisci parte reale: ");
			r2 = scanner.nextInt();
			System.out.print("Inserisci parte immaginaria: ");
			i2 = scanner.nextInt();
		} catch(InputMismatchException ex) {
			System.out.println("Errore, input non valido.");
		} finally {
			scanner.close();
		}
		
		
		ComplexNumbers complex1 = new ComplexNumbers(r1, i1);
		ComplexNumbers complex2 = new ComplexNumbers(r2, i2);
		complex1.add(complex2);
		complex1.sub(complex2);
		complex1.prod(complex2);
		complex1.quot(complex2);
		System.out.println("Fine programma");
	}
	
		
	
	
}
