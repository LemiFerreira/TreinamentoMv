package entidade;

public class Pessoa {

	String cpf;
	String nome;
	int idade;
	String sexo;
	
	// para comparar pessoas através do cpf;
	
	@Override
	public boolean equals(Object obj) {
		Pessoa pessoaEntrada = (Pessoa)obj;
		if(pessoaEntrada.getCpf().equals(this.cpf)) {
			return true;
		}else {
				return false;
			}
		}

		
	
	
	
	
	public String getCpf() {
		return cpf;
		
			
	}
	public void setCpf(String string) {
		this.cpf = string;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	


}
