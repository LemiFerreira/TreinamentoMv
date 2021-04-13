package teste;
import java.util.Scanner;

public class Fibonacci {

	
public static void main(String[] args) {
			
			
Scanner leTeclado = new Scanner(System.in);
			
					int num1 = 0;
			
					int num2 = 1;
			
					int num3 = 0;
			
					int number;
				
	System.out.println("Digite um numero da sequencia Fibonacci ");
			
					number = leTeclado.nextInt();
				
			
			while(number > num3) {
				
					num3 = num1 + num2;
				
					num1 = num2;
				
					num2 = num3;
				
			}
			
			
	if(number == 0) {
				System.out.println("Você acertou, o número ZERO está na sequência Fibonacci e o próximo número da sequencia é:  UM.");
				
			}else if (number == num3) {
				
				System.out.println("Parabéns, o número  (" + number + " ), está na sequência Fibonacci e o próximo número é ( "+ (num1+number)+ " ). " );
				
			}else {
								
				System.out.println("Olá, infelizmente este número informado não pertence a sequencia Fibonacci, tente novamente por favor.");
				
			}

		}
	
	}


