package Exercises;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercises {
	
	//Esercizi 1, 2a, 2b, 3a, 5a
		
		//Ex 5a e 5b
		public static int fattoriale(int n) {
		    int fact = 1;
		    for (int v = 1; v <= n; v++) {
		        fact = fact * v;
		    }
		    return fact;
		}
		public static int fattorialerec(int n) {
			if (n == 0)
		        return 1; 
		    else 
		    {   int fact = n * fattorialerec(n-1);
		        return fact;
		    } 
		}
				
		
		public static void ex1() {
			// Ex 1, dato un intero calcola i divisori
			int n;
			int count = 0;
			Scanner scanner = new Scanner(System.in);		
			try {
				System.out.print("Inserisci un numero: ");
				n = scanner.nextInt();
				if (n == 0) {
					System.out.println("Divisori infiniti");
				}
				else {
					boolean flag = false;
					if (n < 0) {
						flag = true;
					}
					int num = Math.abs(n);

					for(int i = 1; i <= num/2; i++ ) {
						
						if (num%i == 0)	{
							if (flag) {
								System.out.println(-i);
							}else {
								System.out.println(i);
							}
							
							count++;
						}
					}
					//ultimo divisore (numero stesso)
					count++;
					if (flag) {
						System.out.println(-num);
					}else {
						System.out.println(num);
					}
				}
				
						
			} catch(InputMismatchException ex) {
				System.out.println("Errore, input non valido.");
			} finally {
				System.out.println("Totale divisori: " + count);
				scanner.close();
			}
			
			
		}
		
		
		public static void ex2a() {
			
			//Ex 2 numeri primi compresi tra due numeri interi inseriti dall'utente
			int n, m;
			Scanner scanner = new Scanner(System.in);	
			try {
				System.out.print("Inserisci il primo numero: ");
				n = scanner.nextInt();
				System.out.print("Inserisci il secondo numero: ");
				m = scanner.nextInt();
				
				for(int i = n; i <= m; i++) {
					boolean flag = true;
					// controllo per numeri negativi uguale ai positivi
					int temp = Math.abs(i);
					if(i == 0) {
						flag = false;
					}
					for(int j = 2; j<temp; j++) {
						if (temp%j == 0)	{
							flag = false;
						}			
						
					}
					if (flag == true) {
						System.out.println(i);
					}
				}
			} catch(InputMismatchException ex) {
				System.out.println("Errore, input non valido.");
			} finally {
				System.out.println("Fine programma");
				scanner.close();
			}
			
			
		}
		
		//Ex 3a, massimo e minimo di numeri inseriti dall'utente
		public static void ex3a() {
			int n = -1;
			Scanner scanner = new Scanner(System.in);	
			
			ArrayList<Integer> num = new ArrayList<Integer>();
			try {
				while(n != 0) {
						System.out.print("Inserisci numero: ");
						n = scanner.nextInt();
						if(n < 0) {
							System.out.print("Errore, il numero deve essere maggiore di 0");
							n = scanner.nextInt();
						}
						if( n != 0) {
							num.add(n);
						}

				} 
			} catch(InputMismatchException ex) {
					System.out.println("Errore, input non valido.");
			} finally {
				scanner.close();
			}
			
			
			int max = num.get(0);
			int min = num.get(0);
			for(int j = 1; j < num.size(); j++) {
				if (num.get(j) > max) {
					max = num.get(j);
				}
				if (num.get(j) < min) {
					min = num.get(j);
				}
			}
			
			System.out.println("Massimo: " + max);
			System.out.println("Minimo: " + min);
		}
		
		
		
		public static void main(String[] args) {
			
			Exercises.ex1();
			//Exercises.ex2a();
			//Exercises.ex3a();
			//System.out.println(Exercises.fattoriale(5));
			//System.out.println(Exercises.fattorialerec(5));
			
			
			
			
		}

	

}
