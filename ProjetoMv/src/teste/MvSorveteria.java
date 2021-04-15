package teste;

import entidade.SorveteriaMv;

import java.util.ArrayList;

import java.util.List;

import java.util.Scanner;


public class MvSorveteria {
	
	public static void main(String[] args) {
	
		System.out.println("             SORVETES MV - UMA DELICIA PARA VOCÊ              ");
		
				Scanner leTeclado2 = new Scanner(System.in);

		List<SorveteriaMv> listSv = new ArrayList<SorveteriaMv>();

		SorveteriaMv sv1 = new SorveteriaMv("OVO MALTINE", 5.00);
		SorveteriaMv sv2 = new SorveteriaMv("MORANGO", 6.00);
		SorveteriaMv sv3 = new SorveteriaMv("CHOCOLATE", 7.00);

		listSv.add(sv1);
		listSv.add(sv2);
		listSv.add(sv3);

		for (SorveteriaMv sorvete : listSv){
			
			
			System.out.println("OPCAO DE SORVETE: " + sorvete.getSabor() + "|" + " VALOR: R$" + sorvete.getValor());
			System.out.println("___________________________________________ ");

		}

		System.out.println("PARA ADICIONAR SORVETE [1] PARA REMOVER [2]");
		SorveteriaMv s1 = new SorveteriaMv("Sabor 1", 5.00);
		
		int menu;
		menu = leTeclado2.nextInt();
		
			switch (menu) {
		case 1:
			s1.inserir();
			break;
		case 2:
			s1.remover();
		case 3:

		default:
			break;
		}

	}
}