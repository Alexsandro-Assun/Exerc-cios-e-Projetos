import java.util.Scanner;

public class ConversorBinario {

	public static void main(String[] args) {
		Scanner ler =  new Scanner(System.in);
		int numero,c=0; 
		System.out.println("CONVERSOR BINÁRIO");
		System.out.println("Digite um número para converter em binário: ");
		numero = ler.nextInt();
		int num = numero;
		do {
			int resto = numero%2;
			System.out.print(resto);
			
			int resultado = numero/2;
			numero = resultado;
			
			if(numero==0 && resto ==1 ) {
				c=1;
			}
			
			
			
		} while(c!=1);
		
		System.out.println("\nCopie e cole o número acima para ver na ordem correta");
		String convertido = ler.next();
		System.out.print(num+" em binário fica: ");
		String[] a = convertido.split("");
        for (int i = a.length - 1; i >= 0; i--) System.out.print(a[i] + "");
		
	}

}
