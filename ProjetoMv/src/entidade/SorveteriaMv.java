package entidade;

import java.util.Scanner;


public class SorveteriaMv {
	
	private String sabor;
	
	private double valor;

	Scanner leTeclado = new Scanner(System.in);

	public SorveteriaMv(String sabor, double valor) {
		
													super();
	
		this.sabor = sabor;
		
		this.valor = valor;
	}

	public void inserir() {
		
					System.out.println("Qual sabor de sorvete você deseja? ");
					this.sabor = leTeclado.nextLine();
		
					System.out.println("Qual o valor do sorvete? ");
					this.valor = leTeclado.nextDouble();
					
					System.out.println("Parabéns, tome o sorvete mais gostoso da cidade no sabor de: " + this.getSabor());
					System.out.println("Valor total da compra: R$ "+ this.getValor());
	}

	public void remover() {
					System.out.println("Que pena que deseja remover. qual sabor deseja retirar? ");
					this.sabor = leTeclado.nextLine();
					System.out.println("O sorvete removido foi: " + this.sabor +" E você deixou de pagar R$ "+this.getValor());
	}

	public String getSabor() {
		return sabor;
		
		
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
		
		
	}

	public double getValor() {
		return valor;
		
		
	}

	public void setValor(double valor) {
		this.valor = valor;
		
		
	}

	

}