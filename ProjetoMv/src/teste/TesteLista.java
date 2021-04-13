package teste;

import java.util.ArrayList;
import java.util.List;

import entidade.Pessoa;

public class TesteLista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Pessoa> listaPessoa = new ArrayList<Pessoa>();
		
		Pessoa p = new Pessoa();
		p.setNome("Icaro");
		p.setCpf("1234");
		p.setIdade(50);
		p.setSexo("M");
		
		Pessoa pp = new Pessoa();
		pp.setNome("Lemi");
		pp.setCpf("5678");
		pp.setIdade(30);
		pp.setSexo("M");
		
		listaPessoa.add(p);
		listaPessoa.add(pp);
		
		
		for(Pessoa pessoa : listaPessoa) {
			System.out.println(pessoa.getNome() + " , idade: "+ pessoa.getIdade());
		}
		
		
		
	}

}