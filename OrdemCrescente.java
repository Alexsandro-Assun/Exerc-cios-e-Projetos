import java.util.Scanner;

public class OrdemCrescente {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		int a,b,c;
		
		System.out.println("Digite o 1º número");
		a = ler.nextInt();
		
		System.out.println("Digite o 2º número");
		b = ler.nextInt();
		
		System.out.println("Digite o 3º número");
		c = ler.nextInt();
		
		if(a<b && a<c && b<c || a==b && b<c || a<b && a<c && b==c) {
			System.out.println(a+" "+b+" "+c);
		}
		
		if(a<b && a<c && c<b || a==c && c<b) {
			System.out.println(a+" "+c+" "+b);
		}
		
		if(b<a && b<c && a<c || b==a && a<c || b<a && b<c && a==c) {
			System.out.println(b+" "+a+" "+c);
		}
		
		if(b<a && b<c && c<a || b==c && c<a) {
			System.out.println(b+" "+c+" "+a);
		}
		
		if(c<a && c<b && a<b || c==a && a<b || c<a && c<b && a==b) {
			System.out.println(c+" "+a+" "+b);
		}
		
		if(c<a && c<b && b<a || c==b && b<a) {
			System.out.println(c+" "+b+" "+a);
		}
	}

}
