package WhileDoFor;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		int a=0,b=1,c,num;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Quanto numeros de Fibonacci deseja ver? ");
		num = ler.nextInt();
		
		if(num==1) {
			System.out.print(a+" ");
		}
		
		if(num==2) {
			System.out.print(a+" ");
			System.out.print(b+" ");
			
		}
				
		if (num>2) {
			System.out.print(a+" ");
			System.out.print(b+" ");
			
			for(int i=0;i<=num-3;i++) {
				c = a+b;
				System.out.print(c+" ");
				a = b;
				b = c;
			}
		}
		
		
	}

}
