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
				System.out.println("Voc� acertou, o n�mero ZERO est� na sequ�ncia Fibonacci e o pr�ximo n�mero da sequencia �:  UM.");
				
			}else if (number == num3) {
				
				System.out.println("Parab�ns, o n�mero  (" + number + " ), est� na sequ�ncia Fibonacci e o pr�ximo n�mero � ( "+ (num1+number)+ " ). " );
				
			}else {
								
				System.out.println("Ol�, infelizmente este n�mero informado n�o pertence a sequencia Fibonacci, tente novamente por favor.");
				
			}

		}
	
	}


