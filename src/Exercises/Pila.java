package Exercises;

public class Pila {

	private int[] num;
	private int index;
	private int maxItems;
	 
	public Pila(int dim) {
		this.num = new int[dim];
		this.maxItems = dim;
		this.index = -1;
	 
	}
	 
	public void push (int a) {
	    if (isFull()) {
	        System.out.println("Pila piena\n");
	        System.exit(1);
	      }

	     System.out.println("Inserisci " + a);
	     this.num[++index] = a;

	}
	public int pop () {
	    if (isEmpty()) {
	        System.out.println("Pila vuota");
	        System.exit(1);
	    }
	    return this.num[index--];
	}
	public int size() {
		return this.index + 1;
	}

		  
	public boolean isEmpty() {
		return this.index == -1;
	}


	public boolean isFull() {
		return this.index == this.maxItems -1;
	}

	public void print() {
		for (int i = 0; i <= this.index; i++) {
			System.out.println(this.num[i]);
		}
	}
	public static void main (String[] args) {
	 
	Pila p = new Pila(5);
	 
	p.push(1);
	p.push(2);
	p.push(6);
	p.push(7);
	p.push(8);
	  
	
	p.pop();
	System.out.println("Dopo una rimozione");
	p.print();
	}
}
