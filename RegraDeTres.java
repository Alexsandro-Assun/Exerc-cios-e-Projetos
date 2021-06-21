import java.util.Scanner;

public class RegraDeTres {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		double x,p,y;
		
		System.out.print("100% = ");
		p = ler.nextDouble();
		System.out.print("X = ");
		x = ler.nextDouble();
		
		y = x*100/p;
		System.out.println(x+" = "+Math.round(y)+"% de "+p);
	}

}
