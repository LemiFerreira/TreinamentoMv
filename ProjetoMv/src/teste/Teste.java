package teste;

import entidade.ContaCorrente;
import entidade.ContaPoupanca;
import entidade.Pessoa;
import entidade.PessoaFisica;
import entidade.conta;


public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pessoa p = new Pessoa();
		p.setCpf("123456789");
		p.setIdade(30);
		p.setNome("Lemi Ferreira");
		p.setSexo("M");
		
		
		Pessoa p2 = new Pessoa();
		p2.setCpf("123456789");
		p2.setIdade(30);
		p2.setNome("Lemi Ferreira");
		p2.setSexo("M");
		
for (int i = 1; i <= 100; i++) {
			
			if( i % 2 ==0) {
				System.out.println(i + "-  " + p.getNome());
			
		}
		
		
		}
				
conta conta = new conta();
ContaPoupanca cp = new ContaPoupanca();
ContaCorrente cc = new ContaCorrente();

	conta.setNumero(111);
	conta.setSaldo(100);
	
	cp.setNumero(123);
	cp.setSaldo(100);
	
	cc.setNumero(222);
	cc.setSaldo(100);
	cc.setTaxa(7);
	
	conta.sacar(20);
	cc.sacar(20);
	cp.sacar(20);
	
	System.out.println("Conta: " + conta.getSaldo());
	System.out.println("Conta: " + cc.getSaldo());
	System.out.println("Conta: " + cp.getSaldo());
	

	p.equals(p2);
	



	}
}
	


