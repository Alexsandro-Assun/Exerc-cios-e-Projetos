import java.util.Random;
import java.util.Scanner;

public class JogoDaForca {

	
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Random sorteio = new Random();
		
		
		String[] lista = {"ohana","paralelepipedo","cidade","anime","estante","computador"};

		String palavra = lista[sorteio.nextInt(5)];
		char[] palavraChave = palavra.toCharArray();
		char[] player = new char[palavra.length()];
		String letrasUsadas ="";
		int letraCerta=0;
		int letraErrada=0;
		boolean jogo = true;
		
		for(int i = 0; i < player.length; i++) {
			player[i] = '_';
		}
		
		
				
		while(jogo == true) {
			
			
			
			System.out.print("\nDigite uma letra meu rei: ");
			System.out.println("\nLetras erradas: "+letrasUsadas);
			
			if(letraErrada == 1) {
				System.out.println("------¬");
				System.out.println("|     O");
				System.out.println("|");
				System.out.println("|");
			}
			else if(letraErrada == 2) {
				System.out.println("------¬");

				System.out.println("|     O");
				System.out.println("|     |");
				System.out.println("|");
			}
			else if(letraErrada == 3) {
				System.out.println("------¬");

				System.out.println("|     O");
				System.out.println("|     |");
				System.out.println("|    /");
			}
			else if(letraErrada == 4) {
				System.out.println("------¬");
				System.out.println("|     O");
				System.out.println("|     |");
				System.out.println("|    / \\");
			}
			else if(letraErrada == 5) {
				System.out.println("------¬");
				System.out.println("|     O");
				System.out.println("|    /|");
				System.out.println("|    / \\");
			}
			
			
			System.out.println("");
			for(int i = 0; i < palavraChave.length; i++) {
				System.out.print(player[i]+" ");
				
			}
			
			
			
			char letra = ler.next().charAt(0);
			
			if(letrasUsadas.indexOf(letra)> -1) {
				System.out.println("Você já tentou esta letra...");
			}
			
			else if(palavra.indexOf(letra) == -1) {
				letrasUsadas += letra+" ";
				letraErrada++;
				
			} 
			
				for(int i = 0; i < player.length; i++) {
					
					 if(letra == player[i]) {
						System.out.println("letra já utilizada");
						break;
					}
					
					 else if(palavra.charAt(i) == letra) {
						player[i]= letra;
						letraCerta++;
					} 
				}
								
				if(letraCerta == palavra.length()) {
					for(int i = 0; i < palavraChave.length; i++) {
						System.out.print(player[i]+" ");
						
					}
					System.out.println("\nGANHOU! ");
					
					jogo = false;
				} else if(letraErrada == 6) {
					System.out.println("------¬");
					System.out.println("|     O");
					System.out.println("|    /|\\");
					System.out.println("|    / \\");
					System.out.println("\nPERDEU PLAYBOY!");
					jogo = false;
				}
				
			}
			
		}//
		
		
	}


