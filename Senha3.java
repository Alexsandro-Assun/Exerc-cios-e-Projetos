import java.util.Scanner;

public class Senha3 {

	public static void main(String[] args) {

		String s, c, nome;

		Scanner ler = new Scanner(System.in);
		System.out.println("Digite seu nome ");
		nome = ler.nextLine();
		
		System.out.println("Digite sua senha : ");
		s = ler.nextLine();
		
		System.out.println("Confirme a senha : ");
		c = ler.nextLine();

		if (c.equals(s)) {
			c = s;
		}
		
		while (c != s) {
			System.out.println("Senha incorreta, digite novamente :");
			c = ler.nextLine();

			if (c.equals(s)) {
				c = s;
			}

		}
		System.out.println("Bem vindo, "+nome);
	}

}
