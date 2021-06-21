import java.util.Scanner;

public class JogoDaVelha {

	
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String x="XXX",o="OOO";
		String a1,a2,a3,b1,b2,b3,c1,c2,c3;
		int op,op1,jogo=0;
	
		boolean vazio = true;
		a1 = " ";
		a2 = " ";
		a3 = " ";
		b1 = " ";
		b2 = " ";
		b3 = " ";
		c1 = " ";
		c2 = " ";
		c3 = " ";

		
		
		do {
			
			
			System.out.println("  a   b   c");
			System.out.println("1 "+a1+" | "+b1+" | "+c1+" ");
			System.out.println(" ---+---+---");
			System.out.println("2 "+a2+" | "+b2+" | "+c2+" ");
			System.out.println(" ---+---+---");
			System.out.println("3 "+a3+" | "+b3+" | "+c3+" ");
			
			System.out.println("\nX Escolha sua posição\n");
			System.out.println("7 = a1  8 = b1  9 = c1");
			System.out.println("4 = a2  5 = b2  6 = c2");
			System.out.println("1 = a3  2 = b3  3 = c3");
			
			op = ler.nextInt();
			switch(op) {
			case 1:
				
				if (a3!=" ") {
					
					System.out.println("Posição já escolhida, escolha de novo");
					op = ler.nextInt();
					
				} else {
					a3 = "X";
					
				}
					
				
			 break;
			 
			case 2:
				if(b3!=" ") {
					System.out.println("Posição já escolhida, escolha de novo");
					op = ler.nextInt();
					
				} else {
				b3 = "X";	
				}
				
			break;
			
			case 3:
				if (c3!=" ") {
					System.out.println("Posição já escolhida, escolha de novo");
					op = ler.nextInt();
					c3 = "X";
				} else {
					c3 = "X";
				}
				
			break;
			
			case 4:
				if(a2!=" ") {
					System.out.println("Posição já escolhida, escolha de novo");
					op = ler.nextInt();
					a2 = "X";
				} else {
					a2 = "X";
				}
				
			break;
				 
			case 5:
				if(b2!=" ") {
					System.out.println("Posição já escolhida, escolha de novo");
					op = ler.nextInt();
					b2 = "X";
				} else {
					b2 = "X";
				}
				
			break;
				
			case 6:
				if (c2!=" ") {
					System.out.println("Posição já escolhida, escolha de novo");
					op = ler.nextInt();
					c2 = "X";
				} else {
					c2 = "X";
				}
				
			break;
			
			case 7:
				if(a1!=" ") {
					System.out.println("Posição já escolhida, escolha de novo");
					op = ler.nextInt();
					a1 = "X";
				} else {
					a1 = "X";
				}
				
			break;
				 
			case 8:
				if(b1!=" ") {
					System.out.println("Posição já escolhida, escolha de novo");
					op = ler.nextInt();
					b1 = "X";
				} else {
					b1 = "X";
				}
				
			break;
				
			case 9:
				if(c1!=" ") {
					System.out.println("Posição já escolhida, escolha de novo");
					op = ler.nextInt();
					c1 = "X";
				} else {
					c1 = "X";
				}
				
			break;
			
			default: 
				System.out.println("Inválido");
			break;
			} if(x.equals(a1+b2+c3) || x.equals(a3+b2+c1) || x.equals(a1+b1+c1) 
			  || x.equals(a2+b2+c2) || x.equals(a3+b3+c3) || x.equals(a1+a2+a3) 
			  || x.equals(b1+b2+b3) || x.equals(c1+c2+c3)) {
				
				System.out.println("  a   b   c");
				System.out.println("1 "+a1+" | "+b1+" | "+c1+" ");
				System.out.println(" ---+---+---");
				System.out.println("2 "+a2+" | "+b2+" | "+c2+" ");
				System.out.println(" ---+---+---");
				System.out.println("3 "+a3+" | "+b3+" | "+c3+" ");
				System.out.println("\n X Ganhou \n");
				jogo =1;

			 }//Switch Case X
			
			System.out.println("  a   b   c");
			System.out.println("1 "+a1+" | "+b1+" | "+c1+" ");
			System.out.println(" ---+---+---");
			System.out.println("2 "+a2+" | "+b2+" | "+c2+" ");
			System.out.println(" ---+---+---");
			System.out.println("3 "+a3+" | "+b3+" | "+c3+" ");
			
			System.out.println("\nO Escolha sua posição\n");
			System.out.println("7 = a1  8 = b1  9 = c1");
			System.out.println("4 = a2  5 = b2  6 = c2");
			System.out.println("1 = a3  2 = b3  3 = c3");
			
			op = ler.nextInt();
			switch(op) {
			case 1:
				if (a3!=" ") {
					System.out.println("Posição já escolhida, escolha de novo");
					op = ler.nextInt();
					
				} else {
					a3 = "O";
				}
			 break;
			 
			case 2:
				if(b3!=" ") {
					System.out.println("Posição já escolhida, escolha de novo");
					op = ler.nextInt();
					b3 = "O";
				} else {
					b3 = "O";	
				}
				
			break;
			
			case 3:
				if (c3!=" ") {
					System.out.println("Posição já escolhida, escolha de novo");
					op = ler.nextInt();
					c3 = "O";
				} else {
					c3 = "O";
				}
				
			break;
			
			case 4:
				if(a2!=" ") {
					System.out.println("Posição já escolhida, escolha de novo");
					op = ler.nextInt();
					a2 = "O";
				} else {
					a2 = "O";
				}
				
			break;
				 
			case 5:
				if(b2!=" ") {
					System.out.println("Posição já escolhida, escolha de novo");
					op = ler.nextInt();
					b2 = "O";
				} else {
					b2 = "O";
				}
				
			break;
				
			case 6:
				if (c2!=" ") {
					System.out.println("Posição já escolhida, escolha de novo");
					op = ler.nextInt();
					c2 = "O";
				} else {
					c2 = "O";
				}
				
			break;
			
			case 7:
				if(a1!=" ") {
					System.out.println("Posição já escolhida, escolha de novo");
					op = ler.nextInt();
					a1 = "O";
				} else {
					a1 = "O";
				}
				
			break;
				 
			case 8:
				if(b1!=" ") {
					System.out.println("Posição já escolhida, escolha de novo");
					op = ler.nextInt();
					b1 = "O";
				} else {
					b1 = "O";
				}
				
			break;
				
			case 9:
				if(c1!=" ") {
					System.out.println("Posição já escolhida, escolha de novo");
					op = ler.nextInt();
					c1 = "O";
				} else {
					c1 = "O";
				}
				
			break;
			
			default: 
				System.out.println("Inválido");
			break;
			}
			//Switch Case O
								 
			 if(o.equals(a1+b2+c3) || o.equals(a3+b2+c1) || o.equals(a1+b1+c1)
			 || o.equals(a2+b2+c2) || o.equals(a3+b3+c3) || o.equals(a1+a2+a3)
			 || o.equals(b1+b2+b3) || o.equals(c1+c2+c3)) {
				 
			 	System.out.println("  a   b   c");
			 	System.out.println("1 "+a1+" | "+b1+" | "+c1+" ");
				System.out.println(" ---+---+---");
				System.out.println("2 "+a2+" | "+b2+" | "+c2+" ");
				System.out.println(" ---+---+---");
				System.out.println("3 "+a3+" | "+b3+" | "+c3+" ");
				System.out.println("\n O Ganhou \n");
				
				 jogo = 1;
			 }
			
		} while(jogo!=1); //while
		
		
		
		
	}

}
